import java.util.ArrayList;

public class Main2 {
    private ArrayList <Main> dataPerpus;
    public static void main(String[] args) throws Exception{
        Main2 Screen = new Main2();
        Screen.inputData();
        Screen.cetakData();
    }
    public void inputData() {
        dataPerpus = new ArrayList<Main>();
        String jawaban;
        int number = 1;
        do {
            System.out.println("=====================================================");
            System.out.println(number+")");
            System.out.print("judul : ");
            String judul = System.console().readLine();
            System.out.print("Author : ");
            String pengarang = System.console().readLine();
            System.out.print("Penerbit : ");
            String penerbit = System.console().readLine();
            System.out.print("Kategori : ");
            String kategori = System.console().readLine();
            System.out.print("Tahun : ");
            Integer tahun = Integer.valueOf(System.console().readLine());
            Main perpus = new Main(judul, pengarang, penerbit, tahun, kategori);
            dataPerpus.add(perpus);
            System.out.print("Apakah anda ingin menambahkan buku lagi? (Ya/ Tidak)");
            jawaban = System.console().readLine();
            number++;
        } while (jawaban.equals("Ya") || jawaban.equals("ya"));
    }
    public Void cetakData() {
        System.out.println("\n\n==============================================================================================");
        System.out.println("DAFTAR BUKU JAVA YANG TERSEDIA");
        System.out.println("==============================================================================================");
        System.out.println("NO\tJudul\t\t\tPengarang\tPenerbit\tTahun\t\tKategori");
        System.out.println("==============================================================================================");

        int j_teknik = 0;
        int j_manajemen = 0;
        int j_fiksi = 0;
        int j_lainnya = 0;
        int b_lawas = 0;
        int b_baru = 0;

        for (int i = 0; i < dataPerpus.size(); i++) {
            System.out.println((i+1)+"\t"+dataPerpus.get(i).judul+"\t"+dataPerpus.get(i).pengarang+"\t"+dataPerpus.get(i).penerbit+"\t"+dataPerpus.get(i).tahun+"\t\t"+dataPerpus.get(i).kategori);

            if (dataPerpus.get(i).kategori.equals("Teknik")) {
                j_teknik++;
            } else if (dataPerpus.get(i).kategori.equals("Manajemen")) {
                j_manajemen++;
            } else if (dataPerpus.get(i).kategori.equals("Fiksi")) {
                j_fiksi++;
            } else if (dataPerpus.get(i).kategori.equals("lainnya")) {
                j_lainnya++;
            }
            if (dataPerpus.get(i).tahun <= 2010) {
                b_lawas++;
            } else {
                b_baru++;
            }
        }   

        System.out.println("==============================================================================================");
        System.out.println("\n\nJumlah Buku yang tersedia : " + dataPerpus.size());;
        System.out.println("Buku Teknik : " + j_teknik);
        System.out.println("Buku Manajemen : " + j_manajemen);
        System.out.println("Buku Fiksi : " + j_fiksi);
        System.out.println("Buku Lainnya : " + j_lainnya);
        System.out.println("Buku Lawas : " + b_lawas);
        System.out.println("Buku Baru : " + b_baru);
        return null;

    }
}             