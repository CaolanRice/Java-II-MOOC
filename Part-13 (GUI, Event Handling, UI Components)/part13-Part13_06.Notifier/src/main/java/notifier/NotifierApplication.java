package notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        TextField top = new TextField();
        Button button = new Button("Update");
        Label label = new Label("");

        button.setOnAction((event) -> {
            label.setText(top.getText());
        });

        VBox components = new VBox();
        components.getChildren().addAll(top, button, label);

        Scene view = new Scene(components);
        window.setScene(view);
        window.show();

    }

}
