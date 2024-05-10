package contoh2;

public class Student extends Person {
    public Student(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return "Student name: "+name;
    }
}


