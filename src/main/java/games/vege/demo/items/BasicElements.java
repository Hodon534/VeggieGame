package games.vege.demo.items;
//ok
public enum BasicElements {
    CARROT("Carrot"),
    ONION("Onion"),
    CUCUMBER("Cucumber"),
    BEETROOT("Beetroot");

    public final String name;
    public final int points;
    public final String buttonColor;
    BasicElements(String name) {
        this.name = name;
        this.points = 50;
        this.buttonColor = "-fx-base: #7fff00;";
    }
}
