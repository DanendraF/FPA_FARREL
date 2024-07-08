// import untuk menangani penyimpanan file
import java.io.FileOutputStream;
import java.io.IOException;

// untuk menangani format XML
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class Larik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] myList = new double[10];
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;
        myList[3] = 4;
        myList[4] = 55;
        myList[5] = 66;
        myList[6] = 77;
        myList[7] = 88;
        myList[8] = 99;
        myList[9] = 00;
    

        // membuat objek dari XStream
        XStream xstream = new XStream(new StaxDriver());

        /*
         * larik yang bertipe double diubah menjadi string dengan format XML
         * kemudian disimpan dalam variabel "xml"
         */
        String xml = xstream.toXML(myList);

        FileOutputStream coba = null;
        try {
            // membuat nama file & folder tempat menyimpan jika perlu
            coba = new FileOutputStream("dataArray.xml");
 
            /*
             * mengubah karakter penyusun string "xml" sebagai bytes (berbentuk nomor2 kode ASCII)
             */
            byte[] bytes = xml.getBytes("UTF-8");
 
            // menyimpan file dari bytes ke dalam file "dataArray.xml"
            coba.write(bytes);
        } catch (Exception e) {
            System.err.println("Perhatian: " + e.getMessage());
        } finally {
            if (coba != null) {
                try {
                    coba.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
