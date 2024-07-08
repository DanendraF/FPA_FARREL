package projectgabungan;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController_2 implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField tfLinkedList, tfAdd, tfHalo;
    
    LinkedList<String> dataLL = new LinkedList<>();
    
    @FXML
    private void AddFirst(ActionEvent event) {
        if(tfAdd.getText().equals("")){
            System.out.println("Tidak ada data yang ditambahkan");
        }else{
            dataLL.addFirst(tfAdd.getText());
            tfLinkedList.setText(dataLL.toString());
            tfAdd.setText("");
        }
    }
    
    @FXML
    private void AddLast(ActionEvent event) {
        if(tfAdd.getText().equals("")){
            System.out.println("Tidak ada data yang ditambahkan");
        }else{
            dataLL.addLast(tfAdd.getText());
            tfLinkedList.setText(dataLL.toString());
            tfAdd.setText("");
        }
    }
    
    @FXML
    private void RemoveFirst(ActionEvent event) {
        if (dataLL.isEmpty()){
            System.out.println("Tidak dapat menghapus data karena linked list kosong");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("Error!! Tidak ada data!!");
            alert.setContentText("Tidak dapat menghapus elemen pertama");
            alert.showAndWait();
        }else{
            dataLL.removeFirst();
            tfLinkedList.setText(dataLL.toString());
        } 
    }
    
    @FXML
    private void RemoveLast(ActionEvent event) {
        if (dataLL.isEmpty()){
            System.out.println("Tidak dapat menghapus data karena linked list kosong");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("Error!! Tidak ada data!!");
            alert.setContentText("Tidak dapat menghapus elemen terakhir");
            alert.showAndWait();
        }else{
            dataLL.removeLast();
            tfLinkedList.setText(dataLL.toString());
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
