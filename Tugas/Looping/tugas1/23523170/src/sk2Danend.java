import java.util.Scanner;

public class sk2Danend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;
        double total = 0;
        boolean lanjut = true;

        do {
            System.out.println(":======== Makanan =======:");
            System.out.println("1. Bakso - Rp. 12.000");
            System.out.println("2. Mie Ayam - Rp. 7.000");
            System.out.println("3. Soto - Rp. 9.000");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda (angka): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    total += 12000;
                    break;
                case 2:
                    total += 7000;
                    break;
                case 3:
                    total += 9000;
                    break;
                case 4:
                    lanjut = false;
                    break;
                default:
                    System.out.println("Menu yang dimasukkan tidak terdaftar.");
            }
        } while (lanjut);

        System.out.println("Terima kasih. Silakan berkunjung kembali.");
        System.out.printf("Total harga: Rp. %.0f,-%n", total);
    }
}