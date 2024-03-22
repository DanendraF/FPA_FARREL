import java.util.Scanner;

public class pembayaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan banyak barang: ");
        int jumlah = input.nextInt();

        System.out.print("Masukkan diskon (%): ");
        double diskon = input.nextDouble();

        double totalTagihan = harga * jumlah * (1 - diskon / 100);
        System.out.println("Total tagihan: " + totalTagihan);
    }
}

//danendrax