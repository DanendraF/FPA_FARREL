package O10_encapsulation;

public class Seragam {
    private Kaus kaus;
    private Celana celana;

    public Seragam (Kaus kaus, Celana celana){
        this.kaus = kaus;
        this.celana = celana;
    }

    public String seragamToString(){
        return this.kaus.kausToString()+" dan "+this.celana.celanaToString();
    }
}
