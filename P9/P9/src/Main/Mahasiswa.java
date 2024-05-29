package Main;

public class Mahasiswa {
    /*
     * Instance variabel
     * Ditulis di dalam kelas dan di luar method, konstruktor, dan di luar blok program
     */
    String NIM;
    String nama;
    String kelas;

    /*
     * Class variabel
     * Menggunakan kata kunci/modifier static
     * Ketika sudah diberi nilai maka akan berlaku untuk semua objek
     * yang di-instansiasi dari class ini
     */
    static String jurusan;
    
    /*
     * Konstruktor
     * Akan dipanggil ketika instansiasi objek dari class Mahasiswa
     * Konstruktor ini meng-overloading default constructor yang sudah disediakan oleh Java
     */
    Mahasiswa(String nomorMhs, String namaMhs,String kelasMhs){
        NIM = nomorMhs;
        nama = namaMhs;
        kelas = kelasMhs;
    }
    
    /*
     * Method non void
     * Menggunakan kata kunci "return"
     * Tidak ada kata kunci void melainkan menggunakan tipe data
     * Tipe data tersebut sesuai dengan tipe data nilai yang dikembalikan
     */
    String identitasToString(){
        return nama+" kuliah di jurusan "+jurusan;
    }

    void hitungNilai(int uts, int uas){
        /*
         * Variabel "nilai" adalah lokal yang dideskripsikan di dalam method "hitungNilai"
         * Variabel ini HANYA dapat diakses "di dalam" method ini saja
         */
        int nilai;
        nilai = (uts+uas)/2;
    }

    /*
     * Method "cekStatusLulus" merupakan class method, milik class ini, bukan milik objek
     * Dapat diakses langsung melalui nama class-nya tanpa harus membuat objeknya
     * 
     */
    static String cekStatusLulus(int nilai){
        String lulus = (nilai >= 80) ? "Lulus" : "Tidak lulus";
        return lulus;
    }

    static String tampilkanInformasi(){
        /*
         * Static method hanya dapat memanggil sesama static method
         * Ingat! Static method/class method menggunakan modifier "static"
         */
        String hasil = cekStatusLulus(81);

        /*
         * Static method hanya dapat menggunakan class variabel
         * Ingat! Class variabel menggunakan modifier "static"
         */
        jurusan = "Kimia";
        return "Jurusan "+jurusan+" hasilnya "+hasil;
    }
    
}
