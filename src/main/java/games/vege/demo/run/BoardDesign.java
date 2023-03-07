package games.vege.demo.run;

import games.vege.demo.actions.BoardUpdates;
import games.vege.demo.enities.Buttons;
import games.vege.demo.enities.FieldMap;
import games.vege.demo.ui.layout.BorderPaneUI;
import games.vege.demo.ui.components.FontsUI;
import games.vege.demo.ui.layout.GridPaneUI;
import games.vege.demo.ui.layout.HBoxUI;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import static games.vege.demo.enities.Buttons.placeButtonsOnGridPane;


public class BoardDesign {

    public static Scene setMainScene() {
        GridPane gridPane = setGridPane();
        HBox hBox = setHBox();

        BorderPane borderPane = setBorderPane();
        borderPane.setCenter(gridPane);
        borderPane.setBottom(hBox);
        Button[][] buttons = Buttons.createAllButtons();
        FieldMap fieldMap = new FieldMap();
        BoardUpdates.updateAllButtons(buttons, fieldMap.getFieldMap());
        placeButtonsOnGridPane(gridPane, buttons);
        return new Scene(borderPane);
    }
    public static BorderPane setBorderPane() {
        BorderPane borderPane = new BorderPane();
        borderPane.setPrefSize(BorderPaneUI.PREF_SIZE_V.value, BorderPaneUI.PREF_SIZE_V1.value);
        return borderPane;
    }
    public static GridPane setGridPane() {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(GridPaneUI.INSETS_V.value, GridPaneUI.INSETS_V1.value, GridPaneUI.INSETS_V2.value, GridPaneUI.INSETS_V3.value));
        gridPane.addRow(GridPaneUI.ROW.value);
        gridPane.addColumn(GridPaneUI.COLUMN.value);
        gridPane.setVgap(GridPaneUI.V_GAP.value);
        gridPane.setHgap(GridPaneUI.H_GAP.value);
        gridPane.setAlignment(Pos.CENTER);

        return gridPane;
    }
    public static HBox setHBox() {
        HBox hBox = new HBox();
        hBox.setSpacing(HBoxUI.SPACING.value);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.setPadding(new Insets(HBoxUI.INSETS_V.value, HBoxUI.INSETS_V1.value, HBoxUI.INSETS_V2.value, HBoxUI.INSETS_V3.value));
        hBox.getChildren().add(setLabel("0/5000"));
        return hBox;
    }

    public static Label setLabel(String message) {
        Label label = new Label(message);
        label.setStyle(FontsUI.LABEL_FONT.size);
        return label;
    }

}
