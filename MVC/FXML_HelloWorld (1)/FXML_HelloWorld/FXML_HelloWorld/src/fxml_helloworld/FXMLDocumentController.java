package fxml_helloworld;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label labelHasil;

    @FXML
    private TextField operand1;

    @FXML
    private TextField operand2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        int angka1, angka2, hasil;
        angka1 = Integer.parseInt(operand1.getText());
        angka2 = Integer.parseInt(operand2.getText());
        hasil = angka1 + angka2;
        labelHasil.setText(Integer.toString(hasil));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
