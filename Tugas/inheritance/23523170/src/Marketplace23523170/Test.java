package Marketplace23523170;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Transaksi dnd;

        System.out.println("================================================================");
        Scanner read = new Scanner(System.in);
        System.out.print("Input jenis member : ");
        String jenisMember = read.nextLine();
        System.out.print("Input harga: ");
        double harga = read.nextDouble();
        System.out.println("================================================================");

        if (jenisMember.equalsIgnoreCase("non member")) {
            dnd = new NonMember();
            dnd.harga = harga;
            System.out.println("================================================================");
            System.out.println("[non-member] Silahkan daftar sebagai member terlebih dulu");
            System.out.println("[non-member] Silahkan daftar sebagai member terlebih dulu");
            System.out.println("================================================================");

        } else if (jenisMember.equalsIgnoreCase("member")) {
            dnd = new Member();
            dnd.harga = harga;
            System.out.println("================================================================");
            System.out.println("[Member] Total bayar tunai : " + dnd.Tunai() + ",(Free Ongkir)");
            System.out.println("[Member] Total bayar per bulan : " + dnd.Kredit());
            System.out.println("================================================================");

        } else if (jenisMember.equalsIgnoreCase("member gold")) {
            dnd = new MemberGold();
            dnd.harga = harga;
            System.out.println("================================================================");
            System.out.println("[Member Gold] Total bayar tunai : " + dnd.Tunai()+ " ,(Free Ongkir)");
            System.out.println("[Member Gold] Total bayar per bulan : " + dnd.Kredit()+ " ,(Free Ongkir)");
            System.out.println("================================================================");

        } else {
            System.out.println("Jenis member tidak tersedia");
        }
    }
}