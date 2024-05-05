public class Penerbangan {
    String kodePenerbangan;
    String tujuanPenerbangan;
    String tanggalPenerbangan;
    String jamPenerbangan;
    Pesawat pesawat;
    Penumpang daftarPenumpang[];
    int gate;

    //Tambahkan konstruktor di bawah ini
    public Penerbangan(String kodePenerbangan, String tujuanPenerbangan, String tanggalPenerbangan, String jamPenerbangan, Pesawat pesawat, Penumpang[] daftarPenumpang, int gate) {
        this.kodePenerbangan = kodePenerbangan;
        this.tujuanPenerbangan = tujuanPenerbangan;
        this.tanggalPenerbangan = tanggalPenerbangan;
        this.jamPenerbangan = jamPenerbangan;
        this.pesawat = pesawat;
        this.daftarPenumpang = daftarPenumpang;
        this.gate = gate;
    }


    public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public String getTujuanPenerbangan() {
        return tujuanPenerbangan;
    }

    public String getTanggalPenerbangan() {
        return tanggalPenerbangan;
    }

    public String getJamPenerbangan(){
        return jamPenerbangan;
    }

    public Pesawat getPesawat() {
        return pesawat;
    }

    public Penumpang[] getDaftarPenumpang() {
        return daftarPenumpang;
    }

    public int getGate() {
        return gate;
    }
}


