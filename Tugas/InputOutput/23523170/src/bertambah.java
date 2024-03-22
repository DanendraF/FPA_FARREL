import java.util.Scanner;

public class bertambah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai 1: ");
        int nilaiPertama = input.nextInt();

        System.out.print("Masukkan nilai 2: ");
        int nilaiKedua = input.nextInt();

        System.out.print("Masukkan nilai 3: ");
        int nilaiKetiga = input.nextInt();

        int hasilPenjumlahan = nilaiPertama + nilaiKedua + nilaiKetiga;
        System.out.println("Hasil penjumlahan ketiga nilai tersebut: " + hasilPenjumlahan);
    }
}

//danendra