package games.vege.demo.actions.moves;

import games.vege.demo.actions.BoardUpdates;
import games.vege.demo.configuration.Settings;
import games.vege.demo.enities.Element;
import games.vege.demo.enities.ElementGrid;

public class PearExplosionMove {
    private final Element[][] elementArray = BoardUpdates.elementGrid.getFieldMap();

    public PearExplosionMove() {

    }

    /*public void makeMove(int row, int col){
        for (int localRow = row; localRow >= 0; localRow--) {
            for (int tempCol = col; tempCol >= 0; col--) {

                elementArray[localRow][tempCol] = new Element(5);
            }
        }
    }*/


}
