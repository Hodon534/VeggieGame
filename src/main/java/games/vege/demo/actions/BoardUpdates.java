package games.vege.demo.actions;

import games.vege.demo.enities.Field;
import games.vege.demo.ui.components.FontsUI;
import games.vege.demo.ui.components.ButtonUI;
import games.vege.demo.configuration.Settings;
import javafx.scene.control.Button;

public class BoardUpdates {

    public static void updateAllButtons(Button[][] buttons, Field[][] fields) {
        for (int col = 0; col < Settings.COLUMN_SIZE.size; col++) {
            for (int row = 0; row < Settings.ROW_SIZE.size; row++) {
                updateSingleButton(buttons, fields, col, row);
            }
        }
    }

    private static void updateSingleButton(Button[][] buttons, Field[][] fields, int col, int row) {
        buttons[col][row].setText(fields[col][row].getName());
        buttons[col][row].setStyle(FontsUI.BUTTON_FONT.size + fields[col][row].getColor());
        buttons[col][row].setPrefWidth(ButtonUI.PREF_WIDTH.value);
        buttons[col][row].setPrefHeight(ButtonUI.PREF_HEIGHT.value);
    }

}
