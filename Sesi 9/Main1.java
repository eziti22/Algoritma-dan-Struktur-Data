import java.util.LinkedList;
import java.util.ListIterator;

public class Main1 {
    private LinkedList<DataZakatFitri> dataWarga;
    private int jumlahBeras = 0;
    private int jumlahUang = 0;
    private int uangSedekah = 0;

    public static void main(String[] args) {
        Main1 screen = new Main1();
        screen.inputData();
        screen.cetakData();
    }

    public void inputData() {
        dataWarga = new LinkedList<DataZakatFitri>();
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

            String sedekah;
            int nominalSedekah = 0;
            do {
                System.out.print("Apakah Anda ingin bersedekah? (Y/N)");
                sedekah = System.console().readLine();
            } while (!sedekah.equalsIgnoreCase("Y") && !sedekah.equalsIgnoreCase("N"));

            if (sedekah.equalsIgnoreCase("Y")) {
                System.out.print("Masukkan nominal sedekah: ");
                nominalSedekah = Integer.parseInt(System.console().readLine());
                uangSedekah += nominalSedekah;
            }

            System.out.println("");
            DataZakatFitri warga = new DataZakatFitri(nama, alamat, metodePembayaran, sedekah, nominalSedekah);
            dataWarga.add(warga);
            System.out.print("Apakah Anda ingin menambahkan data warga lagi? (Y/N)");
            jawaban = System.console().readLine();
            number++;
        } while (jawaban.equalsIgnoreCase("Y"));
    }

public void cetakData() {
    int countBeras = 0;
    int countUang = 0;

    System.out.println("==============================================================");
    System.out.println("\tData Warga Yang Sudah Membayar Zakat");
    System.out.println("==============================================================");
    System.out.println("No\tNama\t\tAlamat\t\tMetode Pembayaran\tNominal Sedekah");
    System.out.println("==============================================================");
    for (ListIterator<DataZakatFitri> it = dataWarga.listIterator(); it.hasNext(); ) {
        DataZakatFitri warga = it.next();
        System.out.println((it.nextIndex()) + "\t" + warga.getNama() + "\t\t" + warga.getAlamat() + "\t\t" + warga.getMetodePembayaran() + "\t\t" + warga.getNominalSedekah());
        if (warga.getMetodePembayaran().equals("Beras")) {
            countBeras++;
        } else if (warga.getMetodePembayaran().equals("Uang")) {
            countUang++;
        }
    }

    System.out.println("\nBanyak warga yang berzakat fitri dengan beras: " + countBeras);
    System.out.println("Banyak warga yang berzakat fitri dengan uang: " + countUang);
    System.out.println("Banyak beras zakat yang terkumpul: " + jumlahBeras + " Kg");
    System.out.println("Banyak uang zakat yang terkumpul: Rp " + jumlahUang);
    System.out.println("Banyak sedekah yang terkumpul: Rp " + uangSedekah);
}
}