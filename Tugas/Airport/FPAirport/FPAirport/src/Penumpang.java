public class Penumpang {
    String idPenumpang;
    String nama;
    String alamat;
    String noKontak;

    //Tambahkan konstruktor di bawah ini
    public Penumpang(String idPenumpang, String nama, String alamat, String noKontak) {
        this.idPenumpang = idPenumpang;
        this.nama = nama;
        this.alamat = alamat;
        this.noKontak = noKontak;
    }

    public String getIdPenumpang() {
        return idPenumpang;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoKontak() {
        return noKontak;
    }
    
    void naik(){}
    void turun(){}
}
