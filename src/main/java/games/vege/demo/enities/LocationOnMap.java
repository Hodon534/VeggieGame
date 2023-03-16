package games.vege.demo.enities;

public class LocationOnMap {
    private final int row;
    private final int col;

    public LocationOnMap(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String toString() {
        return "Row: " + row + " Col: " + col;
    }
}
