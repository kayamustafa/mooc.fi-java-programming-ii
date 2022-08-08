package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application{


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label instructionText = new Label("Enter your name and start.");
        TextField tf = new TextField();
        Button button = new Button("Start");
        
        VBox layout = new VBox();
        layout.getChildren().addAll(instructionText, tf, button);
        
        layout.setPrefSize(300,180);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.setSpacing(10);
        
        Label welcomeText = new Label("");
        VBox secondSceneLayout = new VBox();
        secondSceneLayout.setPrefSize(300,180);
        secondSceneLayout.getChildren().add(welcomeText);
        secondSceneLayout.setAlignment(Pos.CENTER);
        
        Scene firstScene = new Scene(layout);
        Scene secondScene = new Scene(secondSceneLayout);
        
        button.setOnAction((event) -> {
            welcomeText.setText("Welcome " + tf.getText() + "!");
            stage.setScene(secondScene);
        });
        
        stage.setScene(firstScene);
        stage.show();
    }
}
