package games.vege.demo.enities;

import games.vege.demo.items.AdvancedElements;
import games.vege.demo.items.BasicElements;

public class Field {
    private String name;
    private final int id;
    private String color;

    public Field(int id, int colPos, int rowPos){
        this.id = id;
        this.name = setName(id);
        this.color = setColor(id);
    }

    private static String setName(int id) {
        String name = switch (id) {
            case 1 -> BasicElements.CARROT.name;
            case 2 -> BasicElements.ONION.name;
            case 3 -> BasicElements.CUCUMBER.name;
            case 4 -> BasicElements.BEETROOT.name;
            case 5 -> AdvancedElements.PINEAPPLE.name;
            case 6 -> AdvancedElements.PLUM.name;
            case 7 -> AdvancedElements.PEACH.name;
            case 8 -> AdvancedElements.PEAR.name;
            default -> "";
        };
        return name;
    }

    private static String setColor(int id) {
        String name = switch (id) {
            case 1 -> BasicElements.CARROT.buttonColor;
            case 2 -> BasicElements.ONION.buttonColor;
            case 3 -> BasicElements.CUCUMBER.buttonColor;
            case 4 -> BasicElements.BEETROOT.buttonColor;
            case 5 -> AdvancedElements.PINEAPPLE.buttonColor;
            case 6 -> AdvancedElements.PLUM.buttonColor;
            case 7 -> AdvancedElements.PEACH.buttonColor;
            case 8 -> AdvancedElements.PEAR.buttonColor;
            default -> "";
        };
        return name;
    }
    public String getName(){
        return name;
    }
    public int getId() {
        return id;
    }
    public String getColor(){
        return color;
    }
}