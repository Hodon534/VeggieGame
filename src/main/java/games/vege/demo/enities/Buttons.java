package games.vege.demo.enities;

import games.vege.demo.configuration.Settings;
import games.vege.demo.view.BoardDesign;
import games.vege.demo.view.components.ButtonStyle;
import games.vege.demo.view.components.ButtonUI;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Buttons{

    public static Button createButton() {
        Button button = new Button("");
        button.setPrefWidth(ButtonUI.BOARD_PREF_WIDTH.value);
        button.setPrefHeight(ButtonUI.BOARD_PREF_HEIGHT.value);
        button.setStyle(ButtonStyle.BOARD_RADIUS.value);
        return button;
    }

    public static Button[][] createAllButtonsOnGridPane(GridPane gridPane){
        Button[][] buttons = new Button[Settings.ROW.size][Settings.COLUMN.size];
        for (int row = 0; row < Settings.ROW.size; row++) {
            for (int col = 0; col < Settings.COLUMN.size; col++) {
                buttons[row][col] = createButton();
                gridPane.add(buttons[row][col], row, col);
            }
        } return buttons;
    }

    public static void setStartButtonOnAction(Button button, BoardDesign boardDesign, Stage window) {
        button.setOnAction((event) ->
                window.setScene(boardDesign.getScene()));
    }


}
