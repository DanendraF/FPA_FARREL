package O10_encapsulation;

public class Celana {
    private String warna;

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    String celanaToString() {
        return "celana "+this.warna;
    }
}
