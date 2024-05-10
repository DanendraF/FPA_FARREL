package MelebihiElemenLarik;

import java.util.Scanner;

public class MelebihiElemenLarik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[] = new int[10];
        int indeks;

       Scanner scInt = new Scanner(System.in);
       System.out.print("Masukkan indeks elemen yang akan dibaca = ");

       
       try {
        indeks = scInt.nextInt();
       
        System.out.print("Masukkan bilangan pada elemen berindeks "+ indeks + " = ");
        A[indeks] = scInt.nextInt();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("INDEKS MELEBIHI BATAS YANG DITENTUKAN (10)!!!");
       }
    
    }
    
}
