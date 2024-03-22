import java.util.Scanner;

public class ddd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();
        double h = scanner.nextDouble();
        
        
        System.out.println("Pangkat tiga dari " + angka + " adalah " + pangkatTiga(angka));
        System.out.println("Kuadrat dari " + angka + " adalah " + kuadrat(angka));
        System.out.println("Akar kuadrat dari " + angka + " adalah " + akarKuadrat(angka));
        System.out.println("bulat " + angka + " adalah " + bulatkanAngka(angka));
        System.out.println("h " + h + " adalah " + bulatkanAngka(h));

    }

    static double pangkatTiga(double angka) {
        return angka * angka * angka;
    }

    static double kuadrat(double angka){
        return angka * angka;
    }

    
    static double akarKuadrat(double angka) {
        return Math.sqrt((double) angka);
    }

    static double bulatkanAngka(double angka){
        return (int) Math.round(angka);
    }

}

