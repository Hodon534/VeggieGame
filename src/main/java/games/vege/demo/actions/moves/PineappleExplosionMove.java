package games.vege.demo.actions.moves;

import games.vege.demo.configuration.Settings;
import games.vege.demo.enities.Element;
import games.vege.demo.enities.ElementGrid;

public class PineappleExplosionMove{
    private final Element[][] elementArray;

    public PineappleExplosionMove(ElementGrid elementGrid) {
        elementArray = elementGrid.getFieldMap();
    }

    public void makeMove(int col){
        for (int row = 0; row < Settings.ROW.size; row++) {
            for (int tempCol = col; tempCol == col; tempCol++) {
                elementArray[row][tempCol] = null;
            }
        }
    }

}
