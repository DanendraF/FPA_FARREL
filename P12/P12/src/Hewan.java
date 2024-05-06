abstract class Hewan {
    protected boolean apakahBisaBerenang;

    /*
     * Bukan abstract method karena memiliki isi di body method
     */
    String bernapas(){
        return "Setiap hewan bernapas";
    }

    boolean bisaBerenang(){
        return this.apakahBisaBerenang;
    }

    /*
     * Abstract method karena tidak memiliki implementasi/isi 
     */
    abstract String caraBernapas();
    abstract String berkembangbiak();
}
