package games.vege.demo.view;

import games.vege.demo.view.components.ButtonStyle;
import games.vege.demo.view.components.ButtonUI;
import games.vege.demo.view.layout.BorderPaneUI;
import games.vege.demo.view.layout.HBoxUI;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StartPage {
    private final Scene scene;
    private final BorderPane borderPane;
    private final Button startButton;

    public StartPage() {
        this.startButton = createStartButton();
        this.borderPane = setStartBorderPane();
        this.scene = setStartScene();
    }
    private BorderPane setStartBorderPane() {
        BorderPane borderPane = new BorderPane();
        borderPane.setPrefSize(BorderPaneUI.PREF_SIZE_V.value, BorderPaneUI.PREF_SIZE_V1.value);
        borderPane.setCenter(startButton);
        return borderPane;
    }
    private Scene setStartScene() {
        return new Scene(borderPane);
    }
    private Button createStartButton() {
        Button button = new Button("START");
        button.setPrefSize(ButtonUI.START_PREF_WIDTH.value, ButtonUI.START_PREF_HEIGHT.value);
        button.setStyle(ButtonStyle.START_FONT.value + ButtonStyle.START_WEIGHT.value);
        return button;
    }

    public BorderPane getBorderPane(){
        return borderPane;
    }
    public Scene getScene() {
        return scene;
    }
    public Button getStartButton(){
        return startButton;
    }
}
