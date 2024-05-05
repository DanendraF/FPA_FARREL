package O10_encapsulation;

public class O10_Encapsulation {
    public static void main(String[] args) {
        Kaus k = new Kaus();
        Celana c = new Celana();
        Seragam s = new Seragam(k, c);

        k.setWarna("putih");
        System.out.println("warna kaus    : "+k.getWarna());

        c.setWarna("merah");
        System.out.println("warna celana  : "+c.getWarna());

        System.out.println(s.seragamToString());
    }
}
    
    