public class Main {
    public String judul;
    public String pengarang;
    public String penerbit;
    public String kategori;
    public Integer tahun;

    public Main (String judul, String pengarang, String penerbit, Integer tahun, String kategori) {
        this.judul = judul;
        if (judul.length()<8) {
            this.judul = judul+"\t\t";
        } else if (judul.length() < 16) {
            this.judul = judul+"\t";
        } else {
            this.judul = judul;
        }
        this.pengarang = pengarang.length() < 8? pengarang+"\t" : pengarang;
        this.penerbit = penerbit.length() < 8? penerbit+"\t" : penerbit;
        this.tahun = tahun;
        this.kategori = kategori;
        if (kategori.equals("1")) {
            this.kategori = "Teknik";
        } else if (kategori.equals("2")) {
            this.kategori = "Manajemen";
        } else if (kategori.equals("3")) {
            this.kategori = "Fiksi";
        } else {
            this.kategori = "lainnya";
        }
    }
}
 