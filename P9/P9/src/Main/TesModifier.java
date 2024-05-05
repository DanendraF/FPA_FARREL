package Main;

public class TesModifier {
    public static void main(String[] args) {
        ModifierMahasiswa mhs1 = new ModifierMahasiswa();

        mhs1.NIM = "22523001";
        /*
         * Objek mhs1 tidak dapat mengakses class variabel "nama" -
         * karena variabel tersebut hak aksesnya/modifier-nya "private"
         * Variabel yang modifier-nya "private" hanya dapat diakses -
         * di dalam class tersebut
         */
        mhs1.nama = "Agus";
    }
}
