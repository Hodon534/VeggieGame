package games.vege.demo.actions.moves;

import games.vege.demo.actions.BoardUpdates;
import games.vege.demo.configuration.Settings;
import games.vege.demo.enities.Element;
import games.vege.demo.enities.ElementGrid;

public class PlumExplosionMove{
    private final Element[][] elementArray = BoardUpdates.elementGrid.getFieldMap();

    public PlumExplosionMove() {

    }

    public void makeMove(int row) {
        for (int localRow = row; localRow == row; localRow++) {
            for (int col = 0; col < Settings.COLUMN.size; col++) {
                elementArray[localRow][col] = null;
            }
        }
    }
}
