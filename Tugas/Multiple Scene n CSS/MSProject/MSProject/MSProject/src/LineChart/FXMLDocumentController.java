package LineChart;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    

    XYChart.Series<String, Integer> player = new XYChart.Series<>();


    @FXML
    private Button DeleteB1;

    @FXML
    private Button addB1;

    @FXML
    private LineChart Tfwindow;

    @FXML
    private Label label;


    private XYChart series;
    
    @FXML
    private void handleButtonDAction(ActionEvent event) {
        series.getData().remove(2);
    }

    @FXML
    private void handleButtonTAction(ActionEvent event) {
        player.getData().add(new XYChart.Data<>("2024", 180));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        player.getData().add(new XYChart.Data<>("2017", 40));
        player.getData().add(new XYChart.Data<>("2018", 150));
        player.getData().add(new XYChart.Data<>("2019", 200));
        player.getData().add(new XYChart.Data<>("2020", 180));
        player.getData().add(new XYChart.Data<>("2021", 160));
        player.getData().add(new XYChart.Data<>("2022", 160));
        player.getData().add(new XYChart.Data<>("2023", 180));

        Tfwindow.getData().add(player);
    }    
    
}
