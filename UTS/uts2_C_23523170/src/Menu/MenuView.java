package Menu;

import java.util.ArrayList;
import java.util.List;

/*23523170 */
public class MenuView {
    private List<Menu> daftarMenu = new ArrayList<>();

    public List<Menu> getDaftarMenu() {
      return daftarMenu;
  }

public void tambahMenu(Menu menu) {
     daftarMenu.add(menu);
}

public void hapusMenu(Menu menu) {
    daftarMenu.remove(menu);
}

public void tampilkanMenu() {
    System.out.println("Daftar Menu:");
        for (Menu menu : daftarMenu) {
            System.out.println("Nama: " + menu.getNama());
            System.out.println("Harga: " + menu.getHarga());
            System.out.println("Stok: " + menu.getStok());
            System.out.println("Jenis: " + menu.getJenis());
            System.out.println("--------------------");
        }
  }

  public static void main(String[] args) {
    MenuView menuView = new MenuView();

    Menu menu1 = new Menu();
    menu1.setNama("Nasi Goreng");
    menu1.setHarga("15000");
    menu1.setStok("10");
    menu1.setJenis("Makanan");

    Menu menu2 = new Menu();
    menu2.setNama("Es Teh");
    menu2.setHarga("5000");
    menu2.setStok("20");
    menu2.setJenis("Minuman");

    Menu menu3 = new Menu();
    menu3.setNama("Mie");
    menu3.setHarga("10000");
    menu3.setStok("20");
    menu3.setJenis("Minuman");

    Menu menu4 = new Menu();
    menu4.setNama("Air putih");
    menu4.setHarga("2000");
    menu4.setStok("20");
    menu4.setJenis("Minuman");

    menuView.tambahMenu(menu1);
    menuView.tambahMenu(menu2);
    menuView.tambahMenu(menu3);
    menuView.tambahMenu(menu4);

    menuView.tampilkanMenu();
  }
}



