package com.thomasii.budgetplanner.budgetplanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class dbController {
    @FXML
    private Label dateLabel;

    private FXMLLoader root;
    private Stage stage;
    private Scene scene;
    // Header

    // Navigation
    public void logoutButton(ActionEvent event) {
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        System.out.println("Log out successfully");
        stage.close();
    }

    // Switch to scene
    public void switchToLogin(ActionEvent event) throws IOException {
        root = new FXMLLoader(Main.class.getResource("login.fxml"));
        scene = new Scene(root.load(), 500, 300);
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void switchToOverviewDB(ActionEvent event) throws IOException {
        root = new FXMLLoader(Main.class.getResource("dashboard.fxml"));
        scene = new Scene(root.load(), 970, 650);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void switchToBalanceDB(ActionEvent event) throws IOException {
        root = new FXMLLoader(Main.class.getResource("balancedb.fxml"));
        scene = new Scene(root.load(), 970, 650);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}