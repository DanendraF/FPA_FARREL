import Main.ModifierMahasiswa;

public class App {
    public static void main(String[] args) {
        /*
         * Instansiasi objek dengan nama "mhs" dari class "ModifierMahasiswa"
         * Karena letak class ini berbeda folder/package maka perlu "import"
         * Format import yaitu "namaFolder.namaClass"
         */
        ModifierMahasiswa mhs = new ModifierMahasiswa();

        /*
         * Mencoba mengakses variabel dengan modifier "DEFAULT" dari package berbeda
         * Variabel dengan modifier "DEFAULT" TIDAK DAPAT diakses di luar package -
         * di mana variabel tersebut berada
         */
        mhs.NIM = "225230101";

        /*
         * Mencoba mengakses variabel dengan modifier "PUBLIC" dari package berbeda
         * Variabel dengan modifier "PUBLIC" DAPAT diakses di luar package
         */
        mhs.email = "22523001@students.uii.ac.id";


    }
}
