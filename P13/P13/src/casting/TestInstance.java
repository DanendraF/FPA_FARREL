package casting;

public class TestInstance {
    public static void main(String[] args) {
        Parent p = new Father();
        if(p instanceof Children){
            /*
             * Jika p merujuk ke objek Children maka proses -
             * downcasting akan dilakukan
             */
            ((Children)p).childrenMethod();
        }
    }
}