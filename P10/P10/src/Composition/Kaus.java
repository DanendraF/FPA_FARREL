package Composition;

public class Kaus {
    private String warna;
    private String strip;

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getWarna(){
        return this.warna;
    }

    public void setStrip(String strip){
        this.strip = strip;
    }

    public String getStrip(){
        return this.strip;
    }
    

    String kausToString(){
        return "Kaus "+this.warna+" strip "+this.strip;
    }
}
