public class DataZakatFitri {
  private String nama;
  private String alamat;
  private String metodePembayaran;
  private String sedekah;
  private int nominalSedekah;

public DataZakatFitri(String nama, String alamat, String metodePembayaran, int jumlahZakat, String sedekah, int nominalSedekah) {
    this.nama = nama;
    this.alamat = alamat;
    this.metodePembayaran = metodePembayaran;
    this.sedekah = sedekah;
    this.nominalSedekah = nominalSedekah;
}

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

public String getAlamat() {
    return alamat;
}

public void setAlamat(String alamat) {
    this.alamat = alamat;
}

public String getMetodePembayaran() {
    return metodePembayaran;
}

public void setMetodePembayaran(String metodePembayaran) {
    this.metodePembayaran = metodePembayaran;
}

public String getSedekah() {
    return sedekah;
}

public void setSedekah(String sedekah) {
    this.sedekah = sedekah;
}

public int getNominalSedekah() {
    return nominalSedekah;
}

public void setNominalSedekah(int nominalSedekah) {
    this.nominalSedekah = nominalSedekah;
}


}