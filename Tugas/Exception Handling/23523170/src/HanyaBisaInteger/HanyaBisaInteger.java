package HanyaBisaInteger;

import java.util.Scanner;
import java.util.InputMismatchException;

public class HanyaBisaInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age;
        Scanner scInt = new Scanner(System.in);
        System.out.print("Masukkan suatu bilangan = ");

        try {
            age = scInt.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Perhatikan!! Hanya bisa Angka!!");
      }
      
    }

}
