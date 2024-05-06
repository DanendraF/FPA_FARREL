package Mobil23523170;

public class MobilPraktik{
    public static void main(String[] args) {
        Humvee super1 = new Humvee();
        MobilOffroad sub1 = new MobilOffroad();
        MobilKeluarga sub2 = new MobilKeluarga();

        super1.berjalan();

        sub1.berjalan();
        sub1.melewatiRintanganAlam();

        sub2.berjalan();
        sub2.menampilkanHiburan();


    
    }
}
