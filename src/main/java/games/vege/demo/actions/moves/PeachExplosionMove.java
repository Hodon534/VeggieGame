package games.vege.demo.actions.moves;

import games.vege.demo.configuration.Settings;
import games.vege.demo.enities.Element;
import games.vege.demo.enities.ElementGrid;

public class PeachExplosionMove{
    private final Element[][] elementArray;

    public PeachExplosionMove(ElementGrid elementGrid) {
        elementArray = elementGrid.getFieldMap();

    }

    public void makeMove(int row, int col){
        if (checkIfElementInArray(row, col)) {
            elementArray[row][col] = null;
        }
        if (checkIfElementInArray(row-1, col)) {
            elementArray[row-1][col] = null;
        }
        if (checkIfElementInArray(row+1, col)) {
            elementArray[row+1][col] = null;
        }
        if (checkIfElementInArray(row, col-1)) {
            elementArray[row][col-1] = null;
        }
        if (checkIfElementInArray(row, col+1)) {
            elementArray[row][col+1] = null;
        }
        if (checkIfElementInArray(row-1, col-1)) {
            elementArray[row-1][col-1] = null;
        }
        if (checkIfElementInArray(row-1, col+1)) {
            elementArray[row-1][col+1] = null;
        }
        if (checkIfElementInArray(row+1, col+1)) {
            elementArray[row+1][col+1] = null;
        }
        if (checkIfElementInArray(row+1, col-1)) {
            elementArray[row+1][col-1] = null;
        }
    }

    public boolean checkIfElementInArray(int row, int col){
        boolean exist = false;
        if (row >= 0 && row < Settings.ROW.size && col >= 0 && col < Settings.COLUMN.size) {
            exist = true;
        } return exist;
    }

}
