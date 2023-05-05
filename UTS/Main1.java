import java.util.ArrayList;

public class Main1 {
    private ArrayList<DataZakatFitri> dataWarga;
    private int jumlahBeras = 0;
    private int jumlahUang = 0;
    private int uangSedekah = 0;

    public static void main(String[] args) {
        Main1 screen = new Main1();
        screen.inputData();
        screen.cetakData();
    }

    public void inputData() {
        dataWarga = new ArrayList<DataZakatFitri>();
        String jawaban;
        int number = 1;
        do {
            System.out.println("======= SOAL 1 =====");
            System.out.println("Data Warga ke " + number);
            System.out.print("Nama : ");
            String nama = System.console().readLine();
            System.out.print("Alamat : ");
            String alamat = System.console().readLine();
            System.out.println("Metode Pembayaran : ");
            System.out.println("1. Beras (2.5 Kg)");
            System.out.println("2. Uang (Rp 35.000)");
            System.out.print("Pilih metode pembayaran (1/2): ");
            int pilihan = Integer.parseInt(System.console().readLine());

            String metodePembayaran;
            int jumlahZakat;
            switch (pilihan) {
                case 1:
                    metodePembayaran = "Beras";
                    jumlahZakat = 2;
                    jumlahBeras += jumlahZakat;
                    break;
                case 2:
                    metodePembayaran = "Uang";
                    jumlahZakat = 35000;
                    jumlahUang += jumlahZakat;
                    break;
                default:
                    metodePembayaran = "Tidak Valid";
                    jumlahZakat = 0;
                    break;
            }

            String jawabanSedekah;
            int nominalSedekah = 0;
            do {
                System.out.print("Apakah Anda ingin bersedekah? (Y/N)");
                jawabanSedekah = System.console().readLine();
            } while (!jawabanSedekah.equalsIgnoreCase("Y") && !jawabanSedekah.equalsIgnoreCase("N"));

            if (jawabanSedekah.equalsIgnoreCase("Y")) {
                System.out.print("Masukkan nominal sedekah: ");
                nominalSedekah = Integer.parseInt(System.console().readLine());
                uangSedekah += nominalSedekah;
            }

            System.out.println("");
            DataZakatFitri warga = new DataZakatFitri(nama, alamat, metodePembayaran, jumlahZakat, jawabanSedekah, nominalSedekah);
            dataWarga.add(warga);
            System.out.print("Apakah Anda ingin menambahkan data warga lagi? (Y/N)");
            jawaban = System.console().readLine();
            number++;
        } while (jawaban.equalsIgnoreCase("Y"));
    }

    public void cetakData() {
    int countBeras = 0;
    int countUang = 0;
    int totalBeras = 0;
    int totalUang = 0;

    System.out.println("==============================================================");
    System.out.println("\tData Warga Yang Sudah Membayar Zakat");
    System.out.println("==============================================================");
    System.out.println("No\tNama\t\tAlamat\t\tMetode Pembayaran");
    System.out.println("==============================================================");
    for (int i = 0; i < dataWarga.size(); i++) {
        System.out.println((i+1) + "\t" + dataWarga.get(i).getNama() + "\t\t" + dataWarga.get(i).getAlamat() + "\t\t" + dataWarga.get(i).getMetodePembayaran());
        if (dataWarga.get(i).getMetodePembayaran().equals("Beras")) {
            countBeras++;
            totalBeras += 2.5;
        } else if (dataWarga.get(i).getMetodePembayaran().equals("Uang")) {
            countUang++;
            totalUang += 35000;
        }
    }

    System.out.println("\nBanyak warga yang menghitung zakat fitri dengan beras: " + countBeras);
    System.out.println("Banyak warga yang menghitung zakat fitri dengan uang: " + countUang);
    System.out.println("Banyak beras zakat yang terkumpul: " + totalBeras + " Kg");
    System.out.println("Banyak uang zakat yang terkumpul: Rp " + totalUang);

}

public void cetakData() {
    int totalBeras = 0; // variabel untuk menghitung total beras yang terkumpul
    int totalUang = 0; // variabel untuk menghitung total uang yang terkumpul
    int countBeras = 0; // variabel untuk menghitung jumlah warga yang zakatnya dihitung dengan beras
    int countUang = 0; // variabel untuk menghitung jumlah warga yang zakatnya dihitung dengan uang

    System.out.println("Data Warga yang Membayar Zakat Fitri");
    System.out.println("------------------------------------");

    for (DataZakatFitri data : dataWarga) {
        System.out.println("Warga " + data.nama + " membayar zakat fitri sebesar " + data.zakatFitri + " kg beras atau Rp " + data.zakatUang);
        if (data.zakatUang == 0) {
            totalBeras += data.zakatFitri;
            countBeras++;
        } else {
            totalUang += data.zakatUang;
            countUang++;
        }
    }

    System.out.println("------------------------------------");
    System.out.println("Jumlah warga yang menghitung zakat fitri dengan beras: " + countBeras);
    System.out.println("Jumlah warga yang menghitung zakat fitri dengan uang: " + countUang);
    System.out.println("Total beras yang terkumpul: " + totalBeras + " kg");
    System.out.println("Total uang yang terkumpul: Rp " + totalUang);
    System.out.println("Total uang sedekah yang terkumpul: Rp " + totalSedekah);
}
}