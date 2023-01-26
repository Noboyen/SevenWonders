package com.example.sevenwonders;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


public class ThreePlayers_Controller {


    @FXML
    private Button returnButton;

    @FXML
    private Button readyButton;

    @FXML
    private TextField field1;

    @FXML
    private TextField field2;

    @FXML
    private TextField field3;

    @FXML
    private Text Text1;

    @FXML
    private Text Text2;

    @FXML
    private Text Text3;


    @FXML
    void goPlayersPage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) returnButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Menu_Controller.class.getResource("Players_Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Jeu avec 3 joueurs");

        stage.setScene(scene);
        stage.show();
        stage1.close();

    }


    @FXML
    void goFirstGamePage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) readyButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Menu_Controller.class.getResource("FirstGame_Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Jeu avec 3 joueurs");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

    @FXML
    void nameChange1(ActionEvent event) {
        Text1.setText(field1.getText());

    }

    @FXML
    void nameChange2(ActionEvent event) {
        Text2.setText(field2.getText());
    }

    @FXML
    void nameChange3(ActionEvent event) {
        Text3.setText(field3.getText());
    }



}