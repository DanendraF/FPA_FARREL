import java.util.Scanner;

public class NomorTelepon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.next();

        System.out.print("Masukkan Nomor Telepon: ");
        String telp = input.next();

        System.out.println("Halo , " + nama );
        System.out.println("Teleponmu , " + telp);
    }
}

//danendra