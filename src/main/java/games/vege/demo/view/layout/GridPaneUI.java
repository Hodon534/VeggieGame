package games.vege.demo.view.layout;

import games.vege.demo.configuration.Settings;

public enum GridPaneUI {
    /**
     * GridPane settings
     */
    INSETS_V(10), //bottom
    INSETS_V1(10), //left
    INSETS_V2(10), //right
    INSETS_V3(10), //top
    ROW(Settings.ROW.size),
    COLUMN(Settings.COLUMN.size),
    V_GAP(0), //bylo 10
    H_GAP(0); //bylo 10

    public final int value;
    GridPaneUI(int value) {
        this.value = value;
    }

}