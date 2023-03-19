package games.vege.demo.actions.moves;

import games.vege.demo.configuration.Settings;
import games.vege.demo.enities.Element;
import games.vege.demo.enities.ElementGrid;

/**
 *
 */
public class Moves {

    protected final ElementGrid elementGrid;
    private final VegetablesMove vegetablesMove;
    private final PlumExplosionMove plumExplosionMove;
    private final PeachExplosionMove peachExplosionMove;
    private final PineappleExplosionMove pineappleExplosionMove;
    //private final PearExplosionMove pearExplosionMove;
    public static Element[][] elementArray;

    public Moves(ElementGrid elementGrid) {
        this.elementGrid = elementGrid;
        this.vegetablesMove = new VegetablesMove(elementGrid);
        this.plumExplosionMove = new PlumExplosionMove(elementGrid);
        this.peachExplosionMove = new PeachExplosionMove(elementGrid);
        this.pineappleExplosionMove = new PineappleExplosionMove(elementGrid);
        //this.pearExplosionMove = new PearExplosionMove(elementGrid);
        this.elementArray = elementGrid.getFieldMap();
    }

    public void chooseWhichMoveToMake(int row, int col){
        int fieldId = getFieldId(row, col);
        if (isFieldVegetable(fieldId)) {
            vegetablesMove.swapFieldsIfPossible(row, col);
        } else {
            switch (fieldId){
                case 5 -> pineappleExplosionMove.makeMove(col);
                case 6 -> plumExplosionMove.makeMove(row);
                case 7 -> peachExplosionMove.makeMove(row, col);
                //case 8 -> pearExplosionMove.makeMove(row, col);
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
                        if (elementArray[row][tempCol] != null) {
                            elementArray[row][col] = elementGrid.getFieldMap()[row][tempCol];
                            elementArray[row][tempCol] = null;
                            break;
                        }}}}
        } for (int row = Settings.ROW.size-1; row >= 0; row--) {
            for (int col = Settings.COLUMN.size-1; col >= 0; col--) {
                if (elementArray[row][col] == null) {
                    elementArray[row][col] = new Element();
                }}}
    }


}
