package games.vege.demo.run;

import games.vege.demo.actions.*;
import games.vege.demo.enities.Buttons;
import games.vege.demo.enities.ElementGrid;
import games.vege.demo.view.BoardDesign;
import games.vege.demo.view.StartPage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class RunGame {
    public static void start(Stage window) {
        window.setTitle("VEGE NINJA");
        BoardDesign boardDesign = new BoardDesign();
        StartPage startPage = new StartPage();
        Buttons.setStartButtonOnAction(startPage.getStartButton(), boardDesign, window);
        Button[][] buttons = Buttons.createAllButtonsOnGridPane(boardDesign.getGridPane());
        ElementGrid elementGrid = new ElementGrid();
        GameMechanics gameMechanics = new GameMechanics(buttons, elementGrid);
        BoardUpdates boardUpdates = new BoardUpdates(buttons, elementGrid, gameMechanics);
        Image appIcon = new Image(RunGame.class.getResourceAsStream("/icon.png"));
        window.getIcons().add(appIcon);
        window.setScene(startPage.getScene());
        window.show();


    }

}
