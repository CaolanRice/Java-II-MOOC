package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane firstLayout = new BorderPane();
        Label firstLabel = new Label("First view!");
        Button firstButton = new Button("To the second view!");
        firstLayout.setTop(firstLabel);
        firstLayout.setCenter(firstButton);

        Scene viewOne = new Scene(firstLayout);
        window.setScene(viewOne);
        window.show();

        VBox secondLayout = new VBox();
        Label secondLabel = new Label("Second view!");
        Button secondButton = new Button("To the third view!");
        secondLayout.getChildren().addAll(secondLabel, secondButton);

        Scene viewTwo = new Scene(secondLayout);

        GridPane thirdLayout = new GridPane();
        Label thirdLabel = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        thirdLayout.add(thirdLabel, 0, 0);
        thirdLayout.add(thirdButton, 1, 1);

        Scene viewThree = new Scene(thirdLayout);

        firstButton.setOnAction((event) -> {
            window.setScene(viewTwo);
        });

        secondButton.setOnAction((event) -> {
            window.setScene(viewThree);
        });
        
        thirdButton.setOnAction((event) -> {
            window.setScene(viewOne);
        });

    }

}
