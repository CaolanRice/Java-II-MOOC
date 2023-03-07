package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        TextField inputName = new TextField();
        Label enterNameLabel = new Label("Enter your name and click start.");
        Button startButton = new Button("Start");

        GridPane firstLayout = new GridPane();

        firstLayout.add(enterNameLabel, 0, 0);
        firstLayout.add(inputName, 0, 1);
        firstLayout.add(startButton, 0, 2);

        firstLayout.setPrefSize(300, 180);
        firstLayout.setAlignment(Pos.CENTER);
        firstLayout.setVgap(10);
        firstLayout.setHgap(10);
        firstLayout.setPadding(new Insets(20, 20, 20, 20));

        Scene firstView = new Scene(firstLayout);

//        Label welcomeText = new Label("Welcome " + inputName.getText());

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
//        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);
        
        Scene secondView = new Scene(welcomeLayout);
        
        startButton.setOnAction((event) -> {
            String userNameInput = inputName.getText();
            Label welcomeText = new Label("Welcome " + userNameInput + "!");
            welcomeLayout.getChildren().add(welcomeText);
            window.setScene(secondView);
        });
                

        window.setScene(firstView);
        window.show();

    }
}
