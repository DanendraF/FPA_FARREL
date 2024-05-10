package Polymorph;

public class HeadOfDepartment extends Person {
    public HeadOfDepartment(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return "the name is "+name;
    }
}
