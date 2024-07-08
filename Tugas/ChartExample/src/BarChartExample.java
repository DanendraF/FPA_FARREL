import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BarChartExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("BarChart Example");

        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Devices");

        NumberAxis yAxis = new NumberAxis(0,600,100);
        yAxis.setLabel("Visits");

        BarChart <String, Number> barChart = new BarChart <> (xAxis, yAxis);

        XYChart.Series <String, Number> dataSeries1 = new XYChart.Series<>();
        dataSeries1.setName("2014");

        dataSeries1.getData().add(new XYChart.Data<>("Desktop", 567));
        dataSeries1.getData().add(new XYChart.Data<>("Phone", 65));
        dataSeries1.getData().add(new XYChart.Data<>("Tablet", 23));

        barChart.getData().add(dataSeries1);

        XYChart.Series <String, Number> dataSeries2 = new XYChart.Series<>();
        dataSeries2.setName("2015");

        dataSeries2.getData().add(new XYChart.Data<>("Desktop", 540));
        dataSeries2.getData().add(new XYChart.Data<>("Phone", 120));
        dataSeries2.getData().add(new XYChart.Data<>("Tablet", 36));

        barChart.getData().add(dataSeries2);

        VBox vbox = new VBox(barChart);

        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.setHeight(300);
        primaryStage.setWidth(600);

        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}