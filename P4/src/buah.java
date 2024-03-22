public class buah {
    public static void main(String[] args) {
        int i = 1;
        String Buah[] = { "mangga", "Apel", "jeruk" };

        for (String tampunganBuah : Buah) {
            System.out.println((i + ". " + tampunganBuah));
            i++;
        }
    }
}