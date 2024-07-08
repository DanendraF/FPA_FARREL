import java.io.FileReader;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class XMLToObjectTest {
    public static void main(String[] args) throws FileNotFoundException {
        XStream xstream = new XStream(new StaxDriver());
        xstream.addPermission(AnyTypePermission.ANY);
        xstream.processAnnotations(Mahasiswa.class);
        xstream.processAnnotations(Address.class);

        FileReader reader = new FileReader("dataMHS.xml");
        Mahasiswa mhs = (Mahasiswa) xstream.fromXML(reader);

        System.out.println("Nama: " + mhs.getFirstName() + " " + mhs.getLastName());
        System.out.println("NIM: " + mhs.getNim());
        System.out.println("Kelas: " + mhs.getClassName());
        System.out.println("Alamat: " + mhs.getAddress().getArea() + ", " + 
        mhs.getAddress().getCity() + ", " + 
        mhs.getAddress().getState() + ", " + 
        mhs.getAddress().getCountry() + " " + 
        mhs.getAddress().getZipkode());
    }
}