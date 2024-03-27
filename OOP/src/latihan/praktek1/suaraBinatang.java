package latihan.praktek1;

public class suaraBinatang {
    public suaraBinatang(String nama, String suara) {
        System.out.println("Suara "+nama+ " adalah "+suara);
    }

    public static void main(String[] args) {
        suaraBinatang objek = new suaraBinatang("Kucing", "Meong...");
        suaraBinatang objek2 = new suaraBinatang("Anjing", "GukGuk...");
    }
}
