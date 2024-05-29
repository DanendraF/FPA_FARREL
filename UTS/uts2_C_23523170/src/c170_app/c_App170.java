package c170_app;
import java.util.Scanner;
import Menu.Menu;
import Menu.MenuView;

public class c_App170 {
    public static void main(String[] args) {
    MenuView menuView = new MenuView();
    Scanner scanner = new Scanner(System.in);
    boolean continueOrder = true;

    while (continueOrder) {
      menuView.tampilkanMenu();

      System.out.print("Pilih menu (1, 2, 3, ... atau 0 untuk selesai): ");
      int choice = scanner.nextInt();
      scanner.nextLine(); 

      if (choice == 0) {
        continueOrder = false;
      } else if (choice >= 1 && choice <= menuView.getDaftarMenu().size()) {
        Menu pilihan = menuView.getDaftarMenu().get(choice - 1);
        System.out.println("Anda telah memilih: " + pilihan.getNama());

        //total
        int total = Integer.parseInt(pilihan.getHarga()) * Integer.parseInt(pilihan.getStok());
        System.out.println("Total pembelian: Rp " + total);
      } else {
        System.out.println("Pilihan tidak valid. Silakan pilih item yang benar.");
      }
    }
  }
}