package fxml_helloworld;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;

    @FXML
    private TextField TField1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Success");
        int numberFromTextField = Integer.parseInt(TField1.getText());
        int result = numberFromTextField + 10;
        label.setText(String.valueOf(result));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
