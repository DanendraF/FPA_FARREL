public class Dosen {
    private String namaDosen;
    private int nMhsBimbingan;
    private int nimMhsBimbingan[];

    public Dosen (String nama){
        this.namaDosen = nama;
        this.nMhsBimbingan = 0;
    }

    public void setNimMhsBimbingan(int nim){
        this.nimMhsBimbingan[nMhsBimbingan] = nim;
        nMhsBimbingan++;
    }

    public String getNamaDosen(){
        return namaDosen;
    }
}
