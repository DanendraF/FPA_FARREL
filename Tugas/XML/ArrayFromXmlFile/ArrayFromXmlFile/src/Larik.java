/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// untuk menangani pembacaan file
import java.io.IOException;
import java.io.FileInputStream;

// untuk menangani format XML
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class Larik {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    double[] myLost = new double[10];

    // proses instansiasi class XStream
    XStream xstream = new XStream(new StaxDriver());

    FileInputStream cobi = null;

    try {

      // nama file yang akan dibuka (termasuk folder jika perlu
      cobi = new FileInputStream("coba.xml");

      // harus diingat objek apa yang dahulu disimpan di file
      // program untuk membaca harus sinkron dengan program
      // yang dahulu digunakan untuk menyimpannya

      int isi;
      char charnya;
      String stringnya;

      // isi file dikembalikan menjadi string
      stringnya = "";
      while ((isi = cobi.read()) != -1) {
        charnya = (char) isi;
        stringnya = stringnya + charnya;
      }

      // string isi file dikembalikan menjadi larik double
      myLost = (double[]) xstream.fromXML(stringnya);

      for (int i = 0; i < myLost.length; i++) {
        System.out.println(myLost[i] + " ");
      }

    } catch (Exception e) {
      System.err.println("test: " + e.getMessage());
    } finally {
      if (cobi != null) {
        try {
          cobi.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
}
