package games.vege.demo.actions;

import games.vege.demo.configuration.Settings;
import games.vege.demo.enities.Buttons;
import games.vege.demo.enities.Element;
import games.vege.demo.enities.ElementGrid;
import games.vege.demo.view.BoardDesign;
import games.vege.demo.view.StartPage;
import javafx.scene.control.Button;

public class GameMechanics {
    private Button[][] buttons;

    private final ElementGrid elementGrid;
    private SwapFields swapFields;
    private ExplodeFields explodeFields;

    public GameMechanics(Button[][] buttons, ElementGrid elementGrid) {
        this.buttons = buttons;
        this.elementGrid = elementGrid;
        explodeFields = new ExplodeFields(elementGrid);
        swapFields = new SwapFields(elementGrid, explodeFields);

    }

    public void makeAMove(int row, int col){
        int fieldId = getFieldId(row, col);
        if (isFieldVegetable(fieldId)) {
            swapFields.swapFieldsIfPossible(row, col);
        } else {
            switch (fieldId){
                case 5 -> explodeFields.pineappleColumnExplosion(col);
                case 6 -> explodeFields.plumRowExplosion(row);
                case 7 -> explodeFields.peachSquareExplosion(row, col);
               // case 8 ->;
            }
        } moveFieldsDown();
    }
    public boolean isFieldVegetable(int fieldId) {
        return fieldId == 1 || fieldId == 2 || fieldId == 3 || fieldId == 4;
    }

    public int getFieldId(int row, int col) {
        return elementGrid.getFieldMap()[row][col].getId();
    }

    public void moveFieldsDown() {
        for (int row = Settings.ROW.size - 1; row >= 0; row--) {
            for (int col = Settings.COLUMN.size - 1; col >= 0; col--) {
                if (elementGrid.getFieldMap()[row][col] == null) {
                    for (int tempCol = col-1; tempCol >= 0; tempCol--) {
                        if (elementGrid.getFieldMap()[row][tempCol] != null) {
                            elementGrid.getFieldMap()[row][col] = elementGrid.getFieldMap()[row][tempCol];
                            elementGrid.getFieldMap()[row][tempCol] = null;
                            break;
                        }}}}
        } for (int row = Settings.ROW.size-1; row >= 0; row--) {
            for (int col = Settings.COLUMN.size-1; col >= 0; col--) {
                if (elementGrid.getFieldMap()[row][col] == null) {
                    elementGrid.getFieldMap()[row][col] = new Element();
                }}}
    }

}
