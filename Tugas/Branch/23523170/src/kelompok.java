import java.util.Scanner;

public class kelompok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kelompok = new String[4];
        for (int i = 0; i < 4; i++) {
            kelompok[i] = "";
        }
        String nama;
        char grup;

        for (int i = 0; i < 4; i++) {
            System.out.print("Nama     : ");
            nama = scanner.nextLine();
            System.out.print("Kelompok : ");
            grup = scanner.next().charAt(0);
            scanner.nextLine();

            switch (grup) {
                case 'A':
                    kelompok[0] = (kelompok[0].equals("")) ? nama : kelompok[0] + " | " + nama + " | ";
                    break;
                case 'B':
                    kelompok[1] = (kelompok[1].equals("")) ? nama : kelompok[1] + " | " + nama + " | ";
                    break;
                default:
                    System.out.println("Kelompok tidak valid.");
                    i--;
            }
        }
        System.out.println("");
        System.out.println("Anggota kelompok A : " + kelompok[0]);
        System.out.println("Anggota kelompok B : " + kelompok[1]);
    }
}