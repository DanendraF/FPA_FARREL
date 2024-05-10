package Polymorph;

public class Rector extends Person {

    public Rector(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return "Rector name: "+name;
    }
}
