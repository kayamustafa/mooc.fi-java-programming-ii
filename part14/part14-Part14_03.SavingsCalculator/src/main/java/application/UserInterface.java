package application;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class UserInterface {

    private Slider firstSlider;
    private Slider secondSlider;
    private Label firstLabel;
    private Label secondLabel;

    public void setFirstLabel(String text) {
        this.firstLabel.setText(text);
    }

    public void setSecondLabel(String text) {
        this.secondLabel.setText(text);
    }

    public Slider getFirstSlider() {
        return firstSlider;
    }

    public Slider getSecondSlider() {
        return secondSlider;
    }
    
    public UserInterface(){

        this.firstSlider = new Slider(25,250,25);
        this.secondSlider = new Slider(0,10,0);
        
        firstLabel = new Label(String.valueOf(firstSlider.getValue()));
        secondLabel = new Label(String.valueOf(secondSlider.getValue()));
        
        firstSlider.setShowTickMarks(true);
        firstSlider.setShowTickLabels(true);
     
        secondSlider.setShowTickMarks(true);
        secondSlider.setShowTickLabels(true);
    }
    
    public Parent getView(){
        VBox layout = new VBox();
        BorderPane firstBP = new BorderPane();
        BorderPane secondBP = new BorderPane();
        
        firstBP.setLeft(new Label("Monthly savings"));
        firstBP.setCenter(firstSlider);
        firstBP.setRight(firstLabel);
        
        secondBP.setLeft(new Label("Yearly interest rate"));
        secondBP.setCenter(secondSlider);
        secondBP.setRight(secondLabel);
        
        layout.getChildren().addAll(firstBP, secondBP);
        
        layout.setPadding(new Insets(10,10,10,10));
        layout.setSpacing(10);
        
        return layout;
        
    }
    
}
