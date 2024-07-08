package projectstack;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField tfPush, tfPop, tfStack;
    
    Stack<String> tumpukan = new Stack<>();
    
    @FXML
    private void handlePush(ActionEvent event) {
        if(tfPush.getText().equals("")){
            System.out.println("Tidak ada data yang ditambahkan");
        }else{
            tumpukan.push(tfPush.getText());
            tfPush.setText("");
            tfStack.setText(tumpukan.toString());
        }
    }
    
    @FXML
    private void handlePop(ActionEvent event) {
        if(tumpukan.isEmpty()){
            System.out.println("Stack kosong");
        }else{
            tfPop.setText(tumpukan.pop());
            tfStack.setText(tumpukan.toString());
        }
    }
    
    @FXML
    private void clearAll(ActionEvent event) {
        tumpukan.clear();
        tfStack.setText(tumpukan.toString());
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
