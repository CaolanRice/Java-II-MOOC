package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        TextArea textBox = new TextArea();
        Label length = new Label();
        Label numberOfWords = new Label();
        Label longestWord = new Label();

        
        textBox.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            length.setText("Letters: " + String.valueOf(characters));
            numberOfWords.setText("Words: " + String.valueOf(words));
            longestWord.setText("The longest word is: " + String.valueOf(longest));
        });
        layout.setCenter(textBox);

            HBox textComponents = new HBox();
            textComponents.setSpacing(20);

            textComponents.getChildren().add(length);
            textComponents.getChildren().add(numberOfWords);
            textComponents.getChildren().add(longestWord);
            layout.setBottom(textComponents);

            Scene view = new Scene(layout);
            window.setScene(view);
            window.show();

        }

    }

        
