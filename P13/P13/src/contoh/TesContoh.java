package contoh;

public class TesContoh {
    public static void main(String[] args) {
        Student st = new Student("Sinta");
        Employee em = new Employee("Agus");

        /*
         * Objek ref bertipe Person
         * Objek ref kemudian merujuk ke objek st yang bertipe Student
         */
        Person ref = st;

        /*
         * Objek ref dapat memanggil method getName() milik objek st
         */
        System.out.println(ref.getName());

        ref = em; //Objek ref merujuk ke objek em yang bertipe Employee
        System.out.println(ref.getName()); //getName() milik Employee yang dipanggil
    }
}


