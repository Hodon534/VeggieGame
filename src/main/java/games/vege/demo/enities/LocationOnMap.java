package games.vege.demo.enities;

/**
 * Represents location of the filed that has been clicked by player
 * @param row
 * @param col
 */
public record LocationOnMap(int row, int col) {

    public String toString() {
        return "Row: " + row + " Col: " + col;
    }
}
