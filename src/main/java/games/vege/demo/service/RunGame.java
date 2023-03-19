package games.vege.demo.service;

import games.vege.demo.actions.*;
import games.vege.demo.enities.Buttons;
import games.vege.demo.view.BoardDesign;
import games.vege.demo.view.StartPage;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class RunGame {
    public static void start(Stage window) {
        BoardDesign boardDesign = new BoardDesign();
        StartPage startPage = new StartPage();
        Buttons.setStartButtonOnAction(startPage.getStartButton(), boardDesign, window);
        BoardUpdates boardUpdates = new BoardUpdates(boardDesign.getGridPane());
        stageCreator(window, startPage);
        window.show();
    }

    private static void stageCreator(Stage window, StartPage startPage) {
        window.setTitle("VEGE NINJA");
        Image appIcon = new Image(RunGame.class.getResourceAsStream("/icon.png"));
        window.getIcons().add(appIcon);
        window.setScene(startPage.getScene());
    }

}
