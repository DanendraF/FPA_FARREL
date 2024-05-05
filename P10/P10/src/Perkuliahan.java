public class Perkuliahan {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa(11, "Agus");
        Mahasiswa mhs2 = new Mahasiswa(12, "Desi");

        Dosen  dsn = new Dosen("Joko");

        dsn.setNimMhsBimbingan(mhs1.getNimMahasiswa());
        dsn.setNimMhsBimbingan(mhs2.getNimMahasiswa());
    }
}
