package games.vege.demo.items;

/**
 * BASIC ELEMENTS - vegetables (for each such element that explodes, the player receives 50 points).
 */
public enum BasicElements {
    CARROT("Carrot"),
    ONION("Onion"),
    CUCUMBER("Cucumber"),
    BEETROOT("Beetroot");

    public final String name;
    public final int points;
    public final String buttonColor;
    public final String buttonClickedColor;
    BasicElements(String name) {
        this.name = name;
        this.points = 50;
        this.buttonColor = "-fx-base: #00FF00;";
        this.buttonClickedColor = "-fx-base: #55B4B0;";
    }
}
