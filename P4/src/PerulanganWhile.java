public class PerulanganWhile {
    public static void main(String[] args) {
        int i = 10;
        while (i >= 1) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}