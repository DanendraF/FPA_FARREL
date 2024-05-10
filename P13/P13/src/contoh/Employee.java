package contoh;

public class Employee extends Person {
    public Employee(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return "Employee name: "+name;
    }
}


