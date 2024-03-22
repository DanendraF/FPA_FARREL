import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner baca = new Scanner(System.in);

        System.out.println("Menu makanan:");
        System.out.println("A. Bakso");
        System.out.println("B. Mie Ayam");
        System.out.println("C. Soto");
        System.out.println("D. Rawon");
        System.out.println("E. Opor");
        System.out.print("Masukkan pilihan Anda (huruf): ");
        String pilihan = baca.nextLine();

        String harga;
        switch (pilihan){
            case "A" : harga = "Rp. 12.000,-"; // if (pilihan == 1)
            break;
            case "B" : harga = "Rp. 10.000,-"; // else if (pilihan == 2)
            break;
            case "C" : harga = "Rp. 12.000,-"; // else if (pilihan == 3)
            break;
            case "D" : harga = "Rp. 14.000,-"; // else if (pilihan == 4)
            break;
            case "E" : harga = "Rp. 14.000,-"; // else if (pilihan == 5)
            break;
            default : harga = "Terima Kasih"; // else
        }
        
        System.out.println(harga);
        
    }
}
