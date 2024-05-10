package PembagianNol;

import java.util.Scanner;

public class PembagianNol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float v;
        int x, t;

       Scanner scInt = new Scanner(System.in);
       System.out.print("Masukkan jarak = ");

       x = scInt.nextInt();
       
       System.out.print("Masukkan waktu = ");

       try {
        t = scInt.nextInt();
        v = x / t;
        System.out.println("Hasil Kecepatan (v) yaitu " + v);
       } catch (ArithmeticException e) {
        System.out.println("Waktu Harus diisi dan tidak boleh nol(0)!!!");
       }
       
        
    }
    
}
