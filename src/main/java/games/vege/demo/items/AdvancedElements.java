package games.vege.demo.items;
//ok
public enum AdvancedElements {
    PINEAPPLE("Pineapple"),
    PLUM("Plum"),
    PEACH("Peach"),
    PEAR("Pear");

    public final String name;
    public final int points;
    public final String buttonColor;
    AdvancedElements(String name) {
        this.name = name;
        this.points = 100;
        this.buttonColor = "-fx-base: #9B2335;";
    }
}
