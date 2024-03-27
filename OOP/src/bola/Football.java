package bola;
public class Football {
    String nama;
    String posisi;
    String negara;
    int nomor;

    
    public Football(String na, String pos, String neg, int nom) {
        this.nama = na;
        this.posisi = pos;
        this.negara = neg;
        this.nomor = nom;
    }


    public String posisi() {
        return this.posisi;
    }


    public String na() {
        return this.nama;
    }


    public String neg() {
        return this.negara;
    }


    public int nomor() {
        return this.nomor;
    }
}