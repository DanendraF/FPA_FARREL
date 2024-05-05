package Marketplace23523170;

public class Transaksi {
    public double harga;
    
    public Transaksi (){
    
    }
    public double Tunai(){
        System.out.println("total bayar tunai: " + harga);
        return harga;
    }
    public double Kredit(){
        System.out.println("Total bayar kredit: " + harga);
        return harga;
    }
}
    
