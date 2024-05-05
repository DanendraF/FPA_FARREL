public class App {
    public static void main(String[] args) throws Exception {
        Penumpang pass1 = new Penumpang("0101", "Agus", "Bantul", "087087087087");
        Penumpang pass2 = new Penumpang("6667", "Bagyo", "Sleman", "087087087000");
        Penumpang pass3 = new Penumpang("3334", "DanendraF", "Purwokerto", "08139001293");
        Penumpang daftarPenumpang[] = {pass1, pass2, pass3};

        Pesawat pesawat01 = new Pesawat("J098", 100);
        Penerbangan flight01 = new Penerbangan("FPAJ522", "Bali", "25 Maret 2023", "08:00", pesawat01, daftarPenumpang, 1);

        System.out.println("Detail penerbangan: ");
        System.out.println("Kode Penerbangan: " + flight01.getKodePenerbangan());
        System.out.println("Pesawat: " + flight01.getPesawat().getTipePesawat());
        System.out.println("Waktu Penerbangan: " + flight01.getTanggalPenerbangan() + ", " + flight01.getJamPenerbangan());
        System.out.println("Tujuan Penerbangan: " + flight01.getTujuanPenerbangan());
        System.out.println("Daftar Penumpang: ");

        for (int i = 0; i < daftarPenumpang.length; i++) {
            System.out.println((i + 1) + ". " + daftarPenumpang[i].getNama() + " (" + daftarPenumpang[i].getNoKontak() + ")");
        }

        System.out.println("Gate: " + flight01.getGate());
    }
}