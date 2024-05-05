package Composition;

public class Seragam {
    private Kaus kaus;
    private Celana celana;
    

    public Seragam (){
        this.kaus = new Kaus();
        this.celana = new Celana();
        kaus.setWarna("merah");
        kaus.setStrip("loreng");
        celana.setWarna("putih");

    }

    public String seragamToString(){
        return this.kaus.kausToString()+" "+this.celana.celanaToString();
    }
}
