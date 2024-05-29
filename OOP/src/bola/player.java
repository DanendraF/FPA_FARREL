package bola;
public class player {

    static Football MU[];

    static void buatMU() {
        MU = new Football[5];

        MU[0] = new Football("Rasmus Højlund", "Penyerang", "Denmark", 11);
        MU[1] = new Football("Bruno Fernandes", "Gelandang", "Portugal", 8);
        MU[2] = new Football("Kobbie Mainoo", "Gelandang", "Inggris", 37);
        MU[3] = new Football("Maguire", "Defender", "Inggris", 6);
        MU[4] = new Football("Onana", "Goalkeeper", "Cameroon", 24);
    }

    public static void main(String[] args) {
        buatMU();

        for (Football bola : MU) {
            if (bola.posisi() == "Defender") {
                System.out.println(bola.na() + " -> " + bola.neg());
            }
        }
    }
}