package application;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application{

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
    
    
    @Override
    public void start(Stage stage) {
  
    NumberAxis xAxis = new NumberAxis(1968,2008,4);
    NumberAxis yAxis = new NumberAxis(0, 30, 5);
    
    xAxis.setLabel("Year");
    yAxis.setLabel("Relative support");

    LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
    lineChart.setTitle("Relative support of the parties");

    
    int[] years = {1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008};
    
    Map<String, Map<Integer, Double>> values = new HashMap();
    
    try {
        Files.lines(Paths.get("partiesdata.tsv")).forEach(row -> {
            
            String[] parts = row.split("\t");
            
            if(!parts[0].equals("Party")){
                Map<Integer, Double> percentagesAndYears = new HashMap();
                for(int i = 0; i<years.length; i++){
                    if(!parts[i+1].equals("-"))
                    percentagesAndYears.put(years[i], Double.valueOf(parts[i+1]));  
                }
                values.put(parts[0], percentagesAndYears);
            }
        });
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    

// go through the parties and add them to the chart
    values.keySet().stream().forEach(party -> {
        // a different data set for every party
        XYChart.Series data = new XYChart.Series();
        data.setName(party);

        // add the party's support numbers to the data set
        values.get(party).entrySet().stream().forEach(pair -> {
            data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
        });

        // and add the data set to the chart
        lineChart.getData().add(data);
    });

    Scene view = new Scene(lineChart, 640, 480);
    stage.setScene(view);
    stage.show();
}

}
