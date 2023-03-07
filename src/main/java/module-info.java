module games.vege.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens games.vege.demo to javafx.fxml;
    exports games.vege.demo;
}