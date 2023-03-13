package games.vege.demo.enities;

import games.vege.demo.configuration.Settings;

public class ElementGrid {
    private final Element[][] elementMap;
    //initialize
    public ElementGrid() {
        elementMap = new Element[Settings.ROW.size][Settings.COLUMN.size];
        for (int row = 0; row < Settings.ROW.size; row++) {
            for (int col = 0; col < Settings.COLUMN.size; col++) {
                elementMap[row][col] = createField();
            }
        }
    }

    private Element createField() {
        return new Element();
    }

    public Element[][] getFieldMap() {
        return elementMap;
    }

}
