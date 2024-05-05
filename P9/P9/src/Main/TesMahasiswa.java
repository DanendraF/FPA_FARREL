package Main;

public class TesMahasiswa {
    public static void main(String[] args) {
        // Instansiasi objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("22523001", "Agus");
        Mahasiswa mhs2 = new Mahasiswa("22523002", "Suga");

        // Menampilkan informasi dengan memanggil method identitasToString
        System.out.println(mhs1.identitasToString());
        System.out.println(mhs2.identitasToString());

        // Memberi nilai pada class variabel "jurusan"
        mhs1.jurusan = "Informatika";

        /*
         * Meski pemberian nilai pada class variabel "jurusan" melalui objek "mhs1"
         * akan tetapi nilainya akan berlaku juga untuk objek "mhs2"
         * Ingat! nilai dari "class variabel" akan berlaku untuk semua objek
         * yang dibuat dari class tersebut
         */
        System.out.println();
        System.out.println(mhs1.identitasToString());
        System.out.println(mhs2.identitasToString());

        /*
         * Class Variable dapat diakses langsung melalui Class 
         * tanpa membuat objeknya terlebih dahulu
         */
        Mahasiswa.jurusan = "Industri";

        System.out.println();
        System.out.println(mhs1.identitasToString());
        System.out.println(mhs2.identitasToString());

        /*
         * Mengakses class method langsung melalui nama class-nya
         * Class method tidak dapat diakses oleh objek
         */
        System.out.println();
        System.out.println(Mahasiswa.cekStatusLulus(83));
        
    }
}

/*class variable bisa diakses langsung dari class, berlaku untuk semua objek yang dibuat untuk class itu, ada static didepannya tsb.
*instance variable hanya bisa diakses lewat objek, hanya berlaku untuk objek yang mengaksesnya
*persamaannya berada diluar class, constructor */
