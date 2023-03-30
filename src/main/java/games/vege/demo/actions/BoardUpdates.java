package games.vege.demo.actions;

import games.vege.demo.actions.moves.Moves;
import games.vege.demo.enities.Buttons;
import games.vege.demo.enities.ElementGrid;
import games.vege.demo.view.components.FontsUI;
import games.vege.demo.configuration.Settings;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 * Update whole board after an action (explosion)
 */
public class BoardUpdates {
    private final Button[][] buttons;
    public static final ElementGrid elementGrid = new ElementGrid();
    private final Moves moves;

    public BoardUpdates(GridPane gridPane){
        buttons = Buttons.createAllButtonsOnGridPane(gridPane);
        moves = new Moves();
        updateAllButtons();
    }

    /**
     * Update all buttons, one by one
     */
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
            moves.chooseWhichMoveToMake(row, col);
            updateAllButtons();
        });
    }

}
