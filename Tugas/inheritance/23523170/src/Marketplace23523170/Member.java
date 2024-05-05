package Marketplace23523170;

public class Member extends Transaksi {
    @Override
    public double Tunai() {
        if (harga >= 500000) {
            harga -= 5000;
        }
        return harga;
    }

    @Override
    public double Kredit() {
        return (harga - 5000) / 12.0;
    }
}