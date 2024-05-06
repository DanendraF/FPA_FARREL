package MyInterface;


public class PesawatTerbang implements Terbang {
    int ketinggian = 0;

    @Override
    public int tambahKetinggian(int t) {
        ketinggian = ketinggian + t;
        if (ketinggian < KETINGGIAN_MAX) {
            return ketinggian;
        } else {
            return ketinggian = 100;
        }
        
    }
}
