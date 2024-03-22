import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int benar = 0;
        int salah = 0;

        System.out.println("1. Nama presiden pertama Republik Indonesia?");
        System.out.println("Jawaban: ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("soekarno")) {
            benar++;
        } else {
            salah++;
        }

        System.out.println("2. Ibu kota negara Republik Indonesia adalah?");
        System.out.println("Jawaban: ");
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("jakarta")) {
            benar++;
        } else {
            salah++;
        }

        System.out.println("3. Makanan khas Daerah Istimewa Yogyakarta?");
        System.out.println("Jawaban: ");
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("gudeg")) {
            benar++;
        } else {
            salah++;
        }

        System.out.println("4. Jumlah provinsi yang ada di Indonesia?");
        System.out.println("Jawaban: ");
        answer = scanner.nextLine();
        if (answer.equals("34")) {
            benar++;
        } else {
            salah++;
        }

        System.out.println("Hasil: ");
        System.out.println("Jumlah jawaban benar: " + benar);
        System.out.println("Jumlah jawaban salah: " + salah);
    }
}