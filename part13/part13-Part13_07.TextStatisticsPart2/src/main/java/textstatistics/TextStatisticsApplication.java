package textstatistics;


import java.util.Arrays;
import java.util.Comparator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        TextArea ta = new TextArea();
        Label letters = new Label("Letters: ");
        Label words = new Label("Words: ");
        Label longestWord = new Label("The longest word is: ");
        
        ta.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int countOfWords = parts.length;
            String longest = Arrays.stream(parts).max(Comparator.comparingInt(String::length)).get();
            
            letters.setText("Letters: " + characters);
            words.setText("Words: " + countOfWords);
            longestWord.setText("The longest word is: " + longest);
        });
        
        HBox texts = new HBox();
        texts.setSpacing(10);
        texts.getChildren().add(letters);
        texts.getChildren().add(words);
        texts.getChildren().add(longestWord);

        layout.setBottom(texts);

        layout.setCenter(ta);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}
