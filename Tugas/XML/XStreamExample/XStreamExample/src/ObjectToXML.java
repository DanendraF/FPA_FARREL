import java.io.FileOutputStream;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.*;

public class ObjectToXML {

    /*
     * Membuat data mahasiswa beserta alamatnya
     */
    private Mahasiswa getStudentDetails() {

        /*
         * Membuat objek mahasiswa dengan nama "mhs" dan mengisi datanya
         */
        Mahasiswa mhs = new Mahasiswa();
        mhs.setFirstName("Danendra");
        mhs.setLastName("Adriansyah");
        mhs.setNim(23523170);
        mhs.setClassName("FPA");

        /*
         * Membuat objek address untuk data mahasiswa
         */
        Address address = new Address();
        address.setArea("Griya Karen Indah 1");
        address.setCity("Sokaraja");
        address.setState("Purwokerto");
        address.setCountry("Indonesia");
        address.setZipkode(53181);

        /*
         * Menyematkan objek address menjadi bagian dari objek mhs
         */
        mhs.setAddress(address);
        return mhs;
    }

    public static void main(String args[]) {
        
        // membuat objek XStream
        XStream xstream = new XStream(new StaxDriver());
        xstream.addPermission(AnyTypePermission.ANY);

        // membuat objek dari class ini yaitu ObjectToXML
        ObjectToXML tester = new ObjectToXML();

        // Mengambil data mahasiswa yang dibuat di bagian method "getStudentDetails"
        Mahasiswa mhs = tester.getStudentDetails();

        System.out.println();

        /*
         * Mengkonversi objek mhs menjadi format XML
         * Kemudian hasilnya ditampilkan di console
         */
        String xml = xstream.toXML(mhs);
        System.out.println(xml);
        System.out.println();

        // mengkonversi string XML menjadi objek Mahasiswa
        Mahasiswa mhs1 = (Mahasiswa) xstream.fromXML(xml);
        System.out.println(mhs1);

        /*
         * Menyimpan String "xml" hasil konversi objek mhs menjadi file "dataMHS.xml" 
         */

        // TO DO HERE
        String file = xstream.toXML(mhs);

        FileOutputStream coba = null;
        try {
            coba = new FileOutputStream("dataMHS.xml");
            byte[] data = xml.getBytes();
            coba.write(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                coba.close();
            } catch (IOException e) {
                if (coba != null){
                    try {
                        coba.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
        
    }

}