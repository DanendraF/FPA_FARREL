package fxml_helloworld;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label tanggal0;

    @FXML 
    private Label tanggal1;

    @FXML 
    private Label tanggal2;
    
    @FXML 
    private Label tanggal3;
    
    @FXML 
    private DatePicker Dpicker;
    @FXML
    private void handleSubmitAction(ActionEvent event) {
        String Tanggal;
        LocalDate Now;

        Tanggal = Dpicker.getValue().toString();

        Now = Dpicker.getValue().plusMonths(1);

        tanggal0.setText("Anda Berlangganan mulai dari "+Tanggal);
        tanggal1.setText("Paket Anda Aktif hingga "+Now.toString());
        tanggal2.setText("Akun Anda Aktif sampai "+String.valueOf(Now.withYear(2025)));
        tanggal3.setText(String.valueOf("Hari pertama : " +Now.getDayOfWeek()));

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
