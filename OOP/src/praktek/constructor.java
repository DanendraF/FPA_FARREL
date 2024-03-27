package praktek;


//langsung diisi nilai
public class constructor {
    public String Nama;
    public String NIM;
    public int semester;
    public int umur;

    public constructor(String Nama, String NIM, int semester, int umur) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.semester = semester;
        this.umur = umur;
    }

    public String getNama(){
        return this.Nama;
    }

    public String getNIM(){
        return this.NIM;
    }

    public int getSemester(){
        return this.semester;
    }

    public int getUmur(){
        return this.umur;
    }



//buat dan panggil
public static void main(String[] args) {
    constructor mahasiswa1 = new constructor("Danendra", "23523170", 3, 19);
    constructor mahasiswa2 = new constructor("Rizki", "23523171", 4, 20);
    constructor mahasiswa3 = new constructor("Surya", "23523172", 5, 21);

    System.out.println(mahasiswa1.getNIM());
    }
}

