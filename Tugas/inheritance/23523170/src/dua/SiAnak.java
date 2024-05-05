package dua;

public class SiAnak extends SiInduk {
    public SiAnak(int nilai) {
        super(nilai);
    }

    public static void main(String[] args) {
        SiAnak x = new SiAnak(80);
        x.getNilai();
    }
}