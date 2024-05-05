public class Mahasiswa {
    private int nimMahasiswa;
    private String namaMahasiswa;

    public Mahasiswa(int nim, String nama){
        this.nimMahasiswa = nim;
        this.namaMahasiswa = nama;
    }

    public int getNimMahasiswa(){
        return nimMahasiswa;
    }

    public String getNamaMahasiswa(){
        return namaMahasiswa;
    }
}
