package games.vege.demo;

import games.vege.demo.service.RunGame;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *  VeggieGame
 *  Initialization of app window
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) {
        RunGame.start(window);
    }
}
