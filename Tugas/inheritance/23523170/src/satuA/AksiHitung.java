package satuA;

public class AksiHitung {

    public void kali(int c, int d) {
        int e = c * d;
        System.out.println("Hasil perhitungan sebagai berikut : " + e);
    }

    public void bagi(int c, int d) {
        int e = c / d;
        System.out.println("Hasil perhitungan sebagai berikut : " + e);
    }
    
    public static void main(String[] args) {
        int a = 20, b = 10;
        AksiHitung hitung = new AksiHitung();
        hitung.tambah(a, b);
        hitung.kurang(a, b);
        hitung.kali(a, b);
        hitung.bagi(a, b);
    }
}