package fxml_helloworld;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLFerrariController implements Initializable {
    
    @FXML
    private Label labelF1;

    @FXML
    private Button buttonb1;

    @FXML
    private Button buttonb2;

    @FXML
    private Button buttonb3;
    
    @FXML
    private Button buttonb4;
    

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Jawaban Anda Salah, dia adalah driver ferarri");
        labelF1.setText("Anda Bukan Pengikut F1!!");
    }   
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        System.out.println("Jawaban Anda Salah, dia adalah driver ferarri");
        labelF1.setText("Anda Bukan Pengikut F1!!");
    }
    @FXML
    private void handleButtonAction3(ActionEvent event) {
        System.out.println("Jawaban Anda Salah, dia adalah driver ferarri");
        labelF1.setText("Anda Bukan Pengikut F1!!");
    }
    @FXML
    private void handleButtonAction4(ActionEvent event) {
        System.out.println("Jawaban Anda Benar, dia adalah driver Lotus-Ford");
        labelF1.setText("Yakk Benarr");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
