package com.thomasii.budgetplanner.budgetplanner;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try {
            //Initialize
//            FXMLLoader root = new FXMLLoader(Main.class.getResource("dashboard.fxml"));
            FXMLLoader root = new FXMLLoader(Main.class.getResource("login.fxml"));
            Scene scene = new Scene(root.load(), 970, 650);
            Image avatar = new Image("document.png");

            // Logout by ESC key on keyboard
            EventHandler<KeyEvent> eventHandler = key -> {
                if(key.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key pressed successfully");
                    key.consume(); // <-- stops passing the event to next node
                }
            };

            //External CSS
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("loginStyle.css")).toExternalForm());
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("dbstyle.css")).toExternalForm());

            scene.addEventFilter(KeyEvent.KEY_PRESSED, eventHandler);

            stage.setTitle("PLANwallet");
            stage.getIcons().add(avatar);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.initStyle(StageStyle.UNDECORATED); //Undecorated stage
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}