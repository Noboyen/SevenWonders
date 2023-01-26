package com.example.sevenwonders;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstGame_Controller {

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
    private ComboBox boxJoueur1;

    @FXML
    private ComboBox boxJoueur2;

    @FXML
    private ComboBox boxJoueur3;

    @FXML
    public void initialize() {
        boxJoueur1.getItems().addAll(
                Wonder.Alexandrie,
                Wonder.Rhodes,
                Wonder.Babylone,
                Wonder.Ephese,
                Wonder.Gizeh,
                Wonder.Halicarnasse,
                Wonder.Olympie);

        boxJoueur2.getItems().addAll(
                Wonder.Alexandrie,
                Wonder.Rhodes,
                Wonder.Babylone,
                Wonder.Ephese,
                Wonder.Gizeh,
                Wonder.Halicarnasse,
                Wonder.Olympie);

        boxJoueur3.getItems().addAll(
                Wonder.Alexandrie,
                Wonder.Rhodes,
                Wonder.Babylone,
                Wonder.Ephese,
                Wonder.Gizeh,
                Wonder.Halicarnasse,
                Wonder.Olympie);
    }


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
    void goSecondGamePage(ActionEvent event) throws IOException {
        System.out.println(field1.getText() + " a choisi la merveille : " + boxJoueur1.getValue().toString());
        System.out.println(field2.getText() + " a choisi la merveille : " + boxJoueur2.getValue().toString());
        System.out.println(field3.getText() + " a choisi la merveille : " + boxJoueur3.getValue().toString());
        Player player1 = new Player(field1.getText(), ((Wonder)boxJoueur1.getValue()));
        Player player2 = new Player(field2.getText(), ((Wonder)boxJoueur2.getValue()));
        Player player3 = new Player(field3.getText(), ((Wonder)boxJoueur3.getValue()));


        Stage stage = new Stage();
        Stage stage1 = (Stage) readyButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Menu_Controller.class.getResource("SecondGame_Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Jeu avec 3 joueurs");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }
}
