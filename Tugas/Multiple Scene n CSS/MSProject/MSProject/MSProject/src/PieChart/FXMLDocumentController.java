package PieChart;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class FXMLDocumentController implements Initializable {
    
    ObservableList<PieChart.Data> fnatic = 
        FXCollections.observableArrayList();

    @FXML
    private Button DeleteB1;

    @FXML
    private Button addB1;

    @FXML
    private PieChart Music;

    @FXML
    private Label label;
    
    @FXML
    private void handleButtonDAction(ActionEvent event) {
        fnatic.remove(3);
    }

    @FXML
    private void handleButtonTAction(ActionEvent event) {
        fnatic.add(new PieChart.Data("Ariana Grande", 48));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fnatic.add(new PieChart.Data("The 1975", 70));
        fnatic.add(new PieChart.Data("NIKI", 40));
        fnatic.add(new PieChart.Data("SZA", 27));
        
        Music.setData(fnatic);
    }    
    
}
