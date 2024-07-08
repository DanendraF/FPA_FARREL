package projectgabungan;

import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController_4 implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField tfDaftarAntrian, tfAntrianMasuk, tfAntrianKeluar;
    
    Queue<String> antrian = new LinkedList<>();
    
    @FXML
    private void masukAntrian(ActionEvent event) {
        if(tfAntrianMasuk.getText().equals("")){
            System.out.println("Tidak ada data yang ditambahkan");
        }else{
            antrian.add(tfAntrianMasuk.getText());
            tfAntrianMasuk.setText("");
            tfDaftarAntrian.setText(antrian.toString());
        }
    }
    
    @FXML
    private void keluarAntrian(ActionEvent event) {
        if (antrian.isEmpty()) {
        System.out.println("Antrian kosong, tidak dapat mengeluarkan elemen");
        // Add alert here
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Error");
        alert.setContentText("Antrian kosong, tidak dapat mengeluarkan elemen");
        alert.showAndWait();
    } else {
        tfAntrianKeluar.setText(antrian.remove());
        tfDaftarAntrian.setText(antrian.toString());
    }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
