package O10_encapsulation;

public class Kaus {
    private String warna;
    private String strip;

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    String kausToString() {
        return "kaus " + this.warna + " strip " + this.strip;
    }

}