package games.vege.demo;

import games.vege.demo.service.RunGame;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage window) {
        RunGame.start(window);
    }
}
