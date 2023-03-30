package games.vege.demo.view.layout;

import games.vege.demo.configuration.Settings;
/**
 * Global GridPane settings
 */
public enum GridPaneUI {
    INSETS_V(10), //bottom
    INSETS_V1(10), //left
    INSETS_V2(10), //right
    INSETS_V3(10), //top
    ROW(Settings.ROW.size),
    COLUMN(Settings.COLUMN.size),
    V_GAP(0),
    H_GAP(0);
    public final int value;
    GridPaneUI(int value) {
        this.value = value;
    }

}
