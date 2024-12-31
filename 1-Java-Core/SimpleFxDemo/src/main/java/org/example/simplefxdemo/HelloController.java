package org.example.simplefxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField fullNameField;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome "+fullNameField.getText());
    }

    @FXML
    protected void onOpenSecondSceneClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second-scene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 400);
        Stage stage = (Stage)((Node)(event.getSource())).getScene().getWindow();
//        Stage stage = new Stage();
        stage.setTitle("Second Scene!");
        stage.setScene(scene);
        stage.show();
    }
}