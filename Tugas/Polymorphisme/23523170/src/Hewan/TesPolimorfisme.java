#DANENDRAF

package Hewan;

public class TesPolimorfisme {

    public static void main(String[] args) {
        Mamalia[] daftarM = new Mamalia[6];
        daftarM[0] = new Mamalia();
        daftarM[1] = new Kucing();
        daftarM[2] = new Harimau();
        daftarM[3] = new Gajah();
        daftarM[4] = new Anjing();
        daftarM[5] = new Elang();


        for(Mamalia m : daftarM) System.out.println(m.bersuara());
    
        for (int i = 0; i < daftarM.length; i++) {
            System.out.print("Elemen ke-" + i);
            if (daftarM[i] instanceof Kucing) {
                System.out.println(" adalah Kucing: " + ((Kucing) daftarM[i]).bersuara());
            } else {
                System.out.println(" bukan kucing. " + "nggak ngeonggg...");
            }            
        }
    }
}