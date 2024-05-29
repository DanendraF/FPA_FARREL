import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Tampilan tampilan = new Tampilan();
        Data data = new Data();
        boolean lagi = true;
        boolean bilanganTetap;
        String pilihanOperator;
        while (lagi) {
            tampilan.masukkanData(data);
            bilanganTetap = true;
            while (bilanganTetap){
                tampilan.tampilkanData(data);
                pilihanOperator = tampilan.pilihanOperator();
                switch (pilihanOperator) {
                    case "+":
                        data.Penjumlahan();
                        tampilan.displayHasil(data);
                        break;
                    case "-":
                        data.Pengurangan();
                        tampilan.displayHasil(data);
                        break;
                    case "x":
                        data.Perkalian();
                        tampilan.displayHasil(data);
                        break;
                    case "/":
                        data.Pembagian();
                        tampilan.displayHasil(data);
                        break;
                    case "C":
                        bilanganTetap=false;
                        break;
                    default:
                        tampilan.displaySalahMenu();
                        break;
                }
            }

            tampilan.tanyaLanjutAtauSelesai();
            if (!lagi) {
                break;
            }
            data.reset();
        }
    }
}