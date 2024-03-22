import java.util.Arrays;
import java.util.Collections;

public class ForEach {
    public static void main(String[] args) {
        int angka[] = { 17, -9, 11, 5, 14 };
        // Arrays.sort(angka);
        // Arrays.sort(angka, Collections.reverseOrder());
        for (int tampunganNilai : angka) {
            System.out.println(tampunganNilai);
        }
    }
}
