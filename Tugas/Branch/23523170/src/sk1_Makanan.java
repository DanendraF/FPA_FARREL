import java.util.Scanner;

public class sk1_Makanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==============DanenD===============");
        System.out.println("Mau makan 'sate' atau 'bakso'?");
        System.out.print("pilihan: ");
        String makanan = input.nextLine();
        System.out.println("===================================");

        if (makanan.equals("sate")) {

            System.out.println("Pakai 'lontong' atau 'nasi'?");
            System.out.print("pilihan: ");
            String sate = input.nextLine();
            System.out.println("===================================");
            if (sate.equals("lontong")) {
                System.out.println("Lontong Sate");
            } else if (sate.equals("nasi")) {
                System.out.println("Nasi Sate");
            } else {
                System.out.println("Pilihan tidak sesuai");
            }

            System.out.println("===================================");

        } else if (makanan.equals("bakso")) {

            System.out.println("Bakso 'biasa' atau 'jumbo'?");
            System.out.print("pilihan: ");
            String bakso = input.nextLine();
            System.out.println("===================================");
            if (bakso.equals("biasa")) {
                System.out.println("Bakso Biasa");
            } else if (bakso.equals("jumbo")) {
                System.out.println("Bakso Jumbo");
            } else {
                System.out.println("Pilihan tidak sesuai");
            }
        } else {
            System.out.println("Pilihan tidak sesuai");
            System.out.println("===================================");
        }
    }
}