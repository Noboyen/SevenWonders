module com.example.sevenwonders {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sevenwonders to javafx.fxml;
    exports com.example.sevenwonders;
    exports Interface;
    opens Interface to javafx.fxml;
    exports Console;
    opens Console to javafx.fxml;
}