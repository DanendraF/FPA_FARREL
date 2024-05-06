public class Ikan extends Hewan {
    
    @Override
    String caraBernapas(){
        return "Ikan bernapas dengan insang";
    }

    @Override
    String berkembangbiak(){
        return "Ikan bertelur";
    }

    @Override
    boolean bisaBerenang(){
        super.apakahBisaBerenang = false;
        return super.apakahBisaBerenang;
    }
}
