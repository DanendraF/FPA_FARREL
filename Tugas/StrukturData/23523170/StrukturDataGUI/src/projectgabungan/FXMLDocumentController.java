package projectgabungan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private BorderPane mainPane;
    
    @FXML
    private void keHalaman1(ActionEvent event) {
        OpenScene object=new OpenScene();
        Pane halaman=object.getPane("FXMLDocument_1");
        mainPane.setCenter(halaman);
    }
    
    @FXML
    private void keHalaman2(ActionEvent event) {
        OpenScene object=new OpenScene();
        Pane halaman=object.getPane("FXMLDocument_2");
        mainPane.setCenter(halaman);
    }
    
    @FXML
    private void keHalaman3(ActionEvent event) {
        OpenScene object=new OpenScene();
        Pane halaman=object.getPane("FXMLDocument_3");
        mainPane.setCenter(halaman);
    }
    
    @FXML
    private void keHalaman4(ActionEvent event) {
        OpenScene object=new OpenScene();
        Pane halaman=object.getPane("FXMLDocument_4");
        mainPane.setCenter(halaman);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
