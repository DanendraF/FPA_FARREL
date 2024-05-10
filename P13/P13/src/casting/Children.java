package casting;

public class Children extends Parent {
    int id;

    @Override
    void method(){
        System.out.println("Method from child");
    }

    public void childrenMethod(){
        System.out.println("Only for children");
    }
}


