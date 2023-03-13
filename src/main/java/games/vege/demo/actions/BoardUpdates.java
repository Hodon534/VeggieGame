package games.vege.demo.actions;

import games.vege.demo.enities.ElementGrid;
import games.vege.demo.view.components.FontsUI;
import games.vege.demo.configuration.Settings;
import javafx.scene.control.Button;

public class BoardUpdates {
    private final Button[][] buttons;
    private final ElementGrid elementGrid;
    private final GameMechanics gameMechanics;

    public BoardUpdates(Button[][] buttons, ElementGrid elementGrid, GameMechanics gameMechanics){
        this.buttons = buttons;
        this.elementGrid = elementGrid;
        this.gameMechanics = gameMechanics;
        updateAllButtons();
    }

    public void updateAllButtons() {
        for (int row = Settings.ROW.size-1; row >= 0; row--) {
            for (int col = Settings.COLUMN.size-1; col >= 0; col--) {
                updateSingleButton(row, col);
            }
        }
    }

    private void updateSingleButton(int row, int col) {
        buttons[row][col].setText(elementGrid.getFieldMap()[row][col].getName());
        buttons[row][col].setStyle(FontsUI.BUTTON_FONT.size + elementGrid.getFieldMap()[row][col].getColor());
        setButtonOnAction(row, col);
    }

    public void setButtonOnAction(int row, int col){
        buttons[row][col].setOnAction((event) ->  {
            gameMechanics.makeAMove(row, col);
            updateAllButtons();
        });
    }

}
