package Interface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;


public class Menu_Controller {


    @FXML
    private RadioButton music;

    @FXML
    private Button play;

    @FXML
    void playMusic(ActionEvent event) {

        }

    @FXML
    void playButton(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) play.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(General_Controller.class.getResource(".fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Page Jeu");

        stage.setScene(scene);
        stage.show();
        stage1.close();

        }

}


