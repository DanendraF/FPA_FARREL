public class DoWhile {
    public static void main(String[] args) {
        int i = 9;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i--;
        } while (i >= 1);
    }
}   