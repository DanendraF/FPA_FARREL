package fxml_helloworld;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label question;

    @FXML
    private RadioButton OptionA;

    @FXML
    private RadioButton OptionB;

    @FXML
    private RadioButton OptionC;


    @FXML
    private void handleRadioBAction(ActionEvent event) {
        String rbString = event.getSource().toString();
        int panjang = rbString.length();
        question.setText(rbString.substring(panjang-9,panjang-1));

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
