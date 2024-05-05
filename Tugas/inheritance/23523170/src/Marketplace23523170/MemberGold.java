package Marketplace23523170;

public class MemberGold extends Transaksi{
    @Override 
    public double Tunai() {
        if (harga>= 500000) {
            harga -= 10000;
        }
        return harga;
    }
    @Override 
    public double Kredit() {
    return(harga - 10000)/12;
    }
}
