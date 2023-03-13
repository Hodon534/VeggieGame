package games.vege.demo.enities;

import games.vege.demo.items.AdvancedElements;
import games.vege.demo.items.BasicElements;
import games.vege.demo.tools.ShuffleMachine;

public class Element {
    private final String name;
    private final int id;
    private final String color;
    private final String clickedColor;
    private boolean clicked;

    public Element(){
        this.id = ShuffleMachine.shuffleElements();
        this.name = setName(id);
        this.color = setColor(id);
        this.clickedColor = setClickedColor(id);
        clicked = false;
    }

    public Element(int id) {
        this.id = id;
        this.name = setName(id);
        this.color = setColor(id);
        this.clickedColor = setClickedColor(id);
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

    private static String setClickedColor(int id) {
        String name = switch (id) {
            case 1 -> BasicElements.CARROT.buttonClickedColor;
            case 2 -> BasicElements.ONION.buttonClickedColor;
            case 3 -> BasicElements.CUCUMBER.buttonClickedColor;
            case 4 -> BasicElements.BEETROOT.buttonClickedColor;
            //case 5 -> AdvancedElements.PINEAPPLE.buttonClickedColor;
            //case 6 -> AdvancedElements.PLUM.buttonClickedColor;
            //case 7 -> AdvancedElements.PEACH.buttonClickedColor;
            //case 8 -> AdvancedElements.PEAR.buttonClickedColor;
            default -> "";
        };
        return name;
    }
    public void setClicked(){
        clicked = true;
    }
    public void setUnclick(){
        clicked = false;
    }

    public boolean isClicked(){
        return clicked;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public String getClickedColor(){
        return clickedColor;
    }
}