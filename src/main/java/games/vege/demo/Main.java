package games.vege.demo;

import games.vege.demo.run.RunGame;
import javafx.application.Application;
import javafx.stage.Stage;
import games.vege.demo.run.BoardDesign;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage window) {
        window.setTitle("Vege");
        window.setScene(BoardDesign.setMainScene());
        window.show();
    }


}
