import java.util.Scanner;

public class berbagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai 1: ");
        double nilaiPertama = input.nextDouble();

        System.out.print("Masukkan nilai 2: ");
        double nilaiKedua = input.nextDouble();

        double hasilbagi = nilaiPertama / nilaiKedua;
        System.out.println("Hasil pembagian kedua nilai tersebut: " + hasilbagi);
    }
}


//danendra