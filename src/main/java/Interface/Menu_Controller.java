package Interface;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Menu_Controller extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Menu_Controller.class.getResource("Menu_Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Bienvenue dans le menu !");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private Button playButton;

    @FXML
    private Button closeButton;

    //Ouverture de la Page pour choisir le nombre de joueurs
    @FXML
    void playGame(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) playButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Menu_Controller.class.getResource("Players_Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Page Joueurs");

        stage.setScene(scene);
        stage.show();
        stage1.close();

    }

    //fermer le jeu
    @FXML
    public void closeGame(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }



    public static void main() {
        launch();
    }
}