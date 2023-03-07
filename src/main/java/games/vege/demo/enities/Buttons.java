package games.vege.demo.enities;

import games.vege.demo.configuration.Settings;
import games.vege.demo.ui.layout.GridPaneUI;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Buttons{

    public static Button createButton() {
        Button button = new Button("");
        return button;
    }

    public static Button[][] createAllButtons(){
        Button[][] buttons = new Button[Settings.ROW_SIZE.size][Settings.COLUMN_SIZE.size];
        for (int col = 0; col < Settings.COLUMN_SIZE.size; col++) {
            for (int row = 0; row < Settings.ROW_SIZE.size; row++) {
                buttons[col][row] = createButton();
            }
        } return buttons;
    }

    public static void placeButtonsOnGridPane(GridPane gridPane, Button[][] buttons) {
        for (int col = 0; col < GridPaneUI.COLUMN.value; col++) {
            for (int row = 0; row < GridPaneUI.ROW.value; row++) {
                gridPane.add(buttons[col][row], col, row);
            }
        }
    }

    public void setButtonOnAction(Button button){
        button.setOnAction((event) -> button.setText("OVER"));
    }


}
