package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application{

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }
    
    
    @Override
    public void start(Stage stage) {
  
    NumberAxis xAxis = new NumberAxis(2006,2018,2);
    NumberAxis yAxis = new NumberAxis(0, 100, 10);
    
    xAxis.setLabel("Year");
    yAxis.setLabel("Ranking");

    LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
    lineChart.setTitle("University of Helsinki, Shanghai ranking");

    XYChart.Series data = new XYChart.Series();

    data.getData().add(new XYChart.Data(2007, 73));
    data.getData().add(new XYChart.Data(2008, 68));
    data.getData().add(new XYChart.Data(2009, 72));
    data.getData().add(new XYChart.Data(2010, 72));
    data.getData().add(new XYChart.Data(2011, 74));
    data.getData().add(new XYChart.Data(2012, 73));
    data.getData().add(new XYChart.Data(2013, 76));
    data.getData().add(new XYChart.Data(2014, 73));
    data.getData().add(new XYChart.Data(2015, 67));
    data.getData().add(new XYChart.Data(2016, 56));
    data.getData().add(new XYChart.Data(2017, 56));

    lineChart.getData().add(data);

    Scene view = new Scene(lineChart, 640, 480);
    stage.setScene(view);
    stage.show();
}

}
