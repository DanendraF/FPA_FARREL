import java.util.Scanner;

public class sk1Danend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa panjang larik: ");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        System.out.println("Isilah nilai larik dulu ya !");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Indeks ke-" + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Rekaman Data ===-");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Larik indeks ke-" + i + ", bernilai: " + array[i]);
        }
    }
}