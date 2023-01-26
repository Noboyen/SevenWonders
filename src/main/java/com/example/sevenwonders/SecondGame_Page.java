package com.example.sevenwonders;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SecondGame_Page {

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Menu_Controller.class.getResource("Menu_Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bienvenue dans le menu !");
        stage.setScene(scene);
        stage.show();
    }
}
