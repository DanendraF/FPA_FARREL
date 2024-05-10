package polimorfisme;

public class TesPolimorfisme {
    public static void main(String[] args) {
        String kataTes[] = new String[3];
		Mamalia[] m = new Mamalia[3];
		m[0] = new Mamalia();
		m[1] = new Kucing();
		m[2] = new Harimau();

		for (int i=0; i<3; i++) {
	       	kataTes[i] = m[i].bersuara();	
		}
    }
}
