package casting;

public class CastingObjek {
    public static void main(String[] args) {
        
        //Upcasting
        Parent p = new Children(); //implicit upcasting

        /* 
        Children c = new Children();
        Parent p = (Parent) c; //explicit upcasting
        */

        p.name = "Joko";
        System.out.println(p.name);
        p.method();
        
        //p.childrenMethod();
        //((Children)p).childrenMethod(); //downcasting
    }
}

