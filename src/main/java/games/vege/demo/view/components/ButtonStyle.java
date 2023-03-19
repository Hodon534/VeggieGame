package games.vege.demo.view.components;

public enum ButtonStyle {
    BOARD_RADIUS("-fx-background-radius: 0"),
    START_FONT("-fx-font: 20 arial; "),
    START_WEIGHT("-fx-font-weight: bold;");
    public final String value;
    ButtonStyle(String value) {
        this.value = value;
    }
}
