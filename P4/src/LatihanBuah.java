public class LatihanBuah {
    public static void main(String[] args) {
        String[] buah = { "Durian", "Matoa", "Anggur" };
        String[] tingkat = { "mentah", "matang" };

        for (String namaBuah : buah) {
            for (String tingkatKematangan : tingkat) {
                System.out.println(namaBuah + " " + tingkatKematangan);
            }
        }
    }
}
