public class Pesawat {
    String tipePesawat;
    int jumlahSeat;
    
    //Tambahkan konstruktor di bawah ini
    
    public Pesawat(String tipePesawat, int jumlahSeat) {
        this.tipePesawat = tipePesawat;
        this.jumlahSeat = jumlahSeat;
    }

    public String getTipePesawat(){
        return tipePesawat;
    }


    void lepasLandas(){}
    void mendarat(){}
}



