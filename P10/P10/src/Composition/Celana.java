package Composition;

public class Celana {
    private String warna;

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getWarna(){
        return this.warna;
    }

    String celanaToString(){
        return "celana "+this.warna;
    }
}
