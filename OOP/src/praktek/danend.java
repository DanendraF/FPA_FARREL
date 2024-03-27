package praktek;
public class danend {
    int x = 19;

    public static void main(String[] args) {
        // instansiasi objek
        oop mhs1 = new oop();
        oop mhs2 = new oop();
        oop mhs3 = new oop(); 
    
        // akses objek
        mhs1.NIM = "23523170";
        mhs2.Nama = "DanendraF";


        System.out.println(mhs1.NIM);
        System.out.println(mhs2.Nama);
        
        danend objek = new danend();
        objek.x = 15;
        System.out.println(objek.x);

        mhs1.cetak();
        mhs2.cetak();

        mhs2.Nama = mhs2.getNama();

        System.out.println(mhs2.getNama());

    

    }
}
