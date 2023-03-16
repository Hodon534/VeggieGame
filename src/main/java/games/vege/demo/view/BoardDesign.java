package games.vege.demo.view;

import games.vege.demo.configuration.Settings;
import games.vege.demo.view.layout.BorderPaneUI;
import games.vege.demo.view.components.FontsUI;
import games.vege.demo.view.layout.GridPaneUI;
import games.vege.demo.view.layout.HBoxUI;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class BoardDesign {
    private final Scene scene;
    private final BorderPane borderPane;
    private final GridPane gridPane;
    private final HBox hBox;
    private final Label label;
    private final ProgressBar progressBar;

    public BoardDesign(){
        this.label = setLabel();
        this.progressBar = setProgressBar();
        this.hBox = setHBox();
        this.gridPane = setGridPane();
        this.borderPane = setBorderPane();
        this.scene = setBoardGameScene();
    }

    public Scene setBoardGameScene() {
        return new Scene(borderPane);
    }

    public BorderPane setBorderPane() {
        BorderPane borderPane = new BorderPane();
        borderPane.setPrefSize(BorderPaneUI.PREF_SIZE_V.value, BorderPaneUI.PREF_SIZE_V1.value);
        borderPane.setCenter(gridPane);
        borderPane.setBottom(hBox);
        return borderPane;
    }

    public GridPane setGridPane() {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(GridPaneUI.INSETS_V.value, GridPaneUI.INSETS_V1.value, GridPaneUI.INSETS_V2.value, GridPaneUI.INSETS_V3.value));
        gridPane.addRow(GridPaneUI.ROW.value);
        gridPane.addColumn(GridPaneUI.COLUMN.value);
        gridPane.setVgap(GridPaneUI.V_GAP.value);
        gridPane.setHgap(GridPaneUI.H_GAP.value);
        gridPane.setAlignment(Pos.CENTER);
        return gridPane;
    }

    public HBox setHBox() {
        HBox hBox = new HBox();
        hBox.setSpacing(HBoxUI.SPACING.value);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.setPadding(new Insets(HBoxUI.INSETS_V.value, HBoxUI.INSETS_V1.value, HBoxUI.INSETS_V2.value, HBoxUI.INSETS_V3.value));
        //hBox.getChildren().add(progressBar);
        hBox.getChildren().add(label);
        return hBox;
    }

    public static Label setLabel() {
        String progressLabel = "/" + Settings.MAX_POINTS.size;
        Label label = new Label(progressLabel);
        label.setStyle(FontsUI.LABEL_FONT.size);
        return label;
    }

    public ProgressBar setProgressBar(){
        ProgressBar progressBar = new ProgressBar();
        return progressBar;
    }

    public Scene getScene(){
        return scene;
    }

    public BorderPane getBorderPane(){
        return borderPane;
    }

    public GridPane getGridPane() {
        return gridPane;
    }
}
