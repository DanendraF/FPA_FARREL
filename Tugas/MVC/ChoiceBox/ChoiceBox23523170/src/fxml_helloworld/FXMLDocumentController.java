package fxml_helloworld;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label hasil;

    @FXML
    private ChoiceBox pilihan;

    @FXML
    private TextField addfield;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        addfield.setText(pilihan.getValue().toString());
    }

    @FXML
    private void handleButtonAdd(ActionEvent event) {
        pilihan.getItems().add(addfield.getText());
        addfield.setText("");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        pilihan.getItems().addAll("ManchesterUnited", "RealMadrid", "Borrusia Dortmund");
    }    
    
}
