package application;

import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application{

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        UserInterface ui = new UserInterface();
        Chart chart = new Chart(25, 0);
        
        BorderPane layout = new BorderPane();
        
        DecimalFormat df = new DecimalFormat("0.0");
        
        ui.getFirstSlider().valueProperty().addListener((observable, oldValue, newValue) ->{
            ui.setFirstLabel((String.valueOf(newValue.intValue())));
            chart.addDataToSavings((int) ui.getFirstSlider().getValue());
            chart.addDataToInterest((int) ui.getFirstSlider().getValue(), ui.getSecondSlider().getValue());
        });
        
        ui.getSecondSlider().valueProperty().addListener((observable, oldValue, newValue) ->{
            ui.setSecondLabel(String.valueOf(df.format(newValue.floatValue())));
            chart.addDataToInterest((int) ui.getFirstSlider().getValue(), ui.getSecondSlider().getValue());
        });
        
        
        
        layout.setTop(ui.getView());
        layout.setCenter(chart.getView());
        
        Scene scene = new Scene(layout);
        
        stage.setScene(scene);
        stage.show();
        
    }
    

}
