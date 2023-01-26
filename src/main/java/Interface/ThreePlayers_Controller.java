package Interface;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class ThreePlayers_Controller {


    @FXML
    private Button returnButton;


    @FXML
    void returnPlayers(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) returnButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Menu_Controller.class.getResource("Menu_Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Jeu avec 3 joueurs");

        stage.setScene(scene);
        stage.show();
        stage1.close();

    }


}