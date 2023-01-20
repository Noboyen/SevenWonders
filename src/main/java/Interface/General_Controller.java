package Interface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class General_Controller extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(General_Controller.class.getResource("Menu_Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Bienvenue dans le menu !");
        stage.setScene(scene);
        stage.show();
    }

    public static void main() {
        launch();
    }
}