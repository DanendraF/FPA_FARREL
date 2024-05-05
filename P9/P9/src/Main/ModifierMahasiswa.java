package Main;

public class ModifierMahasiswa {
    /*
     * Jika tidak ada modifier atau kata kunci yang ditulis secara eksplisit - 
     * dalam deklarasi methods, variables, atau constructors -
     * maka hak akses/modifier-nya adalah "DEFAULT"
     * Dapat diakses di luar-classnya
     * Dan tidak dapat diakses di luar package/folder yang memuat class tersebut
     */
    String NIM;

    /*
     * Variabel nama hak akses/modifier-nya "PRIVATE"
     * Hanya bisa diakses di dalam class ini saja
     */
    private String nama;

    /*
     * Variabel nama hak akses/modifier-nya "PUBLIC" maka -
     * dapat diakses di class manapun, DI DALAM maupun DI LUAR package
     */
    public String email;
    
    String identitasToString(){
        // Mengakses variabel nama yang modifier-nya "private"
        return "Nama mahasiswa: "+nama;
    }
}
