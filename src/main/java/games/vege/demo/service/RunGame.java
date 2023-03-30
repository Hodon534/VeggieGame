package games.vege.demo.service;

import games.vege.demo.actions.*;
import games.vege.demo.enities.Buttons;
import games.vege.demo.view.BoardPage;
import games.vege.demo.view.StartPage;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Initialization of everything that happens in Veggie Game
 */
public class RunGame {
    public static void start(Stage window) {
        BoardPage boardPage = new BoardPage();
        StartPage startPage = new StartPage();
        Buttons.setStartButtonOnAction(startPage.getStartButton(), boardPage, window);
        BoardUpdates boardUpdates = new BoardUpdates(boardPage.getGridPane());
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
