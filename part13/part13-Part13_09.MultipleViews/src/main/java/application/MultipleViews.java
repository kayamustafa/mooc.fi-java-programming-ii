package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    public static void main(String[] args) {
        launch(MultipleViews.class);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button firstSceneButton = new Button("To the second view!");
        BorderPane layout = new BorderPane();
        layout.setTop(new Label("First view!"));
        layout.setCenter(firstSceneButton);
        
        Label secondSceneText = new Label("Second View!");
        Button secondSceneButton = new Button("To the third view!");
        VBox vboxLayout = new VBox();
        vboxLayout.getChildren().addAll(secondSceneButton, secondSceneText);
        
        Label thirdSceneText = new Label("Third view!");
        Button thirdSceneButton = new Button("To the first view!");
        GridPane gridLayout = new GridPane();
        gridLayout.add(thirdSceneText, 0, 0);
        gridLayout.add(thirdSceneButton, 1, 1);
        
        Scene firstScene = new Scene(layout);
        Scene secondScene = new Scene(vboxLayout);
        Scene thirdScene = new Scene(gridLayout);
        
        firstSceneButton.setOnAction((event) -> stage.setScene(secondScene));
        secondSceneButton.setOnAction((event) -> stage.setScene(thirdScene));
        thirdSceneButton.setOnAction((event) -> stage.setScene(firstScene));
        
        stage.setScene(firstScene);
        stage.show();
    }

}
