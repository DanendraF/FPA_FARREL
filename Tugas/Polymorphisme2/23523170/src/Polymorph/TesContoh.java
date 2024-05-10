package Polymorph;

public class TesContoh {
    public static void main(String[] args) {
        Person[] daftarP = new Person[5];
        daftarP[0] = new Person();
        daftarP[1] = new Student("Danendra Adriansyah");
        daftarP[2] = new Employee("Daffa Hirza");
        daftarP[3] = new Rector("Davin Axel");
        daftarP[4] = new HeadOfDepartment("Natalia Olivia");

        
        for (Person p : daftarP){
            System.out.println(p.getName());
        }

        System.out.println("");

        for (int i = 0; i < 5; i++){
            if (daftarP[i] instanceof HeadOfDepartment){
                System.out.print("Elemen number " + i + " is the Head Of Department, ");
                System.out.println(((HeadOfDepartment) daftarP[i]).getName());
            } else {
                System.out.println("Elemen number " + i + " isn't Head Of Department");
            }
        }

    }
}


