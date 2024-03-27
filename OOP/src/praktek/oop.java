package praktek;
import java.util.Scanner;

public class oop {

    //ATRIBUT
    String Nama;
    String email;
    String NIM;
    int semester;
    int umur;



    //METHOD
    //tidak mengembalikan nilai
    public void cetak(){
        System.out.println(this.Nama);
    }

    //mengembalikkan nilai
    public String getNama(){
        return this.Nama;
    }


}