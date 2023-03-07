package games.vege.demo.run;

import games.vege.demo.actions.BoardUpdates;
import games.vege.demo.enities.Buttons;
import games.vege.demo.enities.FieldMap;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class RunGame {
    public static void start() {
        Button[][] buttons = Buttons.createAllButtons();
        FieldMap fieldMap = new FieldMap();
        BoardUpdates.updateAllButtons(buttons, fieldMap.getFieldMap());
    }
}
