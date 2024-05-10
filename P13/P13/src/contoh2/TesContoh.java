package contoh2;

public class TesContoh {

    public static void printInformation(Person p){
        /*
         * Method ini akan memanggil method getName() -
         * sesuai objek yang menjadi parameter input -
         * dari pemanggilan method printInformation()
         */
        System.out.println(p.getName());
    }

    public static void main(String[] args) {
        Student st = new Student("Sinta");
        Employee em = new Employee("Agus");
        printInformation(st);
        printInformation(em);
    }
}



