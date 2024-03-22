import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total: ");
        int total = input.nextInt();

        if(total > 10000){
            total -= 500;
        }else{
            total -= 100;
        }

        System.out.println("Total akhir: "+total);
    }
}
