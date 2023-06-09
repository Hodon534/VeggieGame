package games.vege.demo.actions.moves;

import games.vege.demo.actions.BoardUpdates;
import games.vege.demo.enities.Element;
import games.vege.demo.enities.ElementGrid;
import games.vege.demo.enities.LocationOnMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VegetablesMove{
    private LocationOnMap locationOnMap;
    private boolean isFieldAlreadyClicked;
    private final Map<Integer, ArrayList<LocationOnMap>> hashMap;
    private final Element[][] elementArray = BoardUpdates.elementGrid.getFieldMap();
    public VegetablesMove() {
        hashMap = new HashMap<>();
    }

    public void fieldClicked(int row, int col) {
        locationOnMap = new LocationOnMap(row, col);
        setReadyToTrue();
    }

    public void resetFieldClicked() {
        locationOnMap = null;
        setReadyToFalse();
    }

    private void setReadyToTrue() {
        isFieldAlreadyClicked = true;
    }

    private void setReadyToFalse() {
        isFieldAlreadyClicked = false;
    }

    public boolean readyToSwap() {
        return isFieldAlreadyClicked;
    }

    public void swapFields(int row, int col) {
        Element element = new Element(elementArray[row][col].getId());
        elementArray[row][col] = elementArray[locationOnMap.row()][locationOnMap.col()];
        elementArray[locationOnMap.row()][locationOnMap.col()] = element;
        if (!hashMap.containsKey(elementArray[row][col].getId())) {
            hashMap.put(elementArray[row][col].getId(), new ArrayList<>());
            hashMap.get(elementArray[row][col].getId()).add(new LocationOnMap(row, col));
        }
        if (!hashMap.containsKey(elementArray[locationOnMap.row()][locationOnMap.col()].getId())) {
            hashMap.put(elementArray[locationOnMap.row()][locationOnMap.col()].getId(), new ArrayList<>());
            hashMap.get(elementArray[locationOnMap.row()][locationOnMap.col()].getId()).add(new LocationOnMap(locationOnMap.row(), locationOnMap.col()));
        }
        //explodeElementsAfterSwapping();

    }

    public boolean areFieldsNextToEachOther(int row, int col) {
        boolean areTheyNextToEachOther = false;
        if (locationOnMap.row() == row && (locationOnMap.col() - col == 1 || locationOnMap.col() - col == -1)) {
            areTheyNextToEachOther = true;
        } else if (locationOnMap.col() == col && (locationOnMap.row() - row == 1 || locationOnMap.row() - row == -1)) {
            areTheyNextToEachOther = true;
        }
        return areTheyNextToEachOther;
    }

    public void swapFieldsIfPossible(int row, int col) {
        if (!readyToSwap()) {
                fieldClicked(row, col);
        } else if (readyToSwap()) {
                if (areFieldsNextToEachOther(row, col)) {
                    swapFields(row, col);
        } resetFieldClicked();
    }}

    /*public void explodeElementsAfterSwapping() {
        for (Map.Entry<Integer, ArrayList<LocationOnMap>> idNo: hashMap.entrySet()) {
            ArrayList<LocationOnMap> arrayList = idNo.getValue();
            System.out.println(arrayList);
            /*for (LocationOnMap location: arrayList) {
                int row = location.getRow();
                int col = location.getCol();
                if (findUp(row, col)) {
                    arrayList.add(new LocationOnMap(row-1, col));
                }
                if (findDown(row, col)) {
                    arrayList.add(new LocationOnMap(row+1, col));
                }
                if (findRight(row, col)) {
                    arrayList.add(new LocationOnMap(row, col+1));
                }
                if (findLeft(row, col)) {
                    arrayList.add(new LocationOnMap(row, col-1));
                }

            }
        }
    }

    public boolean findUp(int row, int col) {
        boolean theSameId = false;
        if (row > 0 && row < Settings.ROW.size-1) {
            if (elementArray[row-1][col].getId() == elementArray[row][col].getId()) {
                theSameId = true;
            }
        } return theSameId;
    }
    public boolean findDown(int row, int col) {
        boolean theSameId = false;
        if (row > 0 && row < Settings.ROW.size-1) {
            if (elementArray[row+1][col].getId() == elementArray[row][col].getId()) {
                theSameId = true;
            }
        } return theSameId;
    }
    public boolean findRight(int row, int col) {
        boolean theSameId = false;
        if (col > 0 && row < Settings.COLUMN.size-1) {
            if (elementArray[row][col+1].getId() == elementArray[row][col].getId()) {
                theSameId = true;
            }
        } return theSameId;
    }
    public boolean findLeft(int row, int col) {
        boolean theSameId = false;
        if (col > 0 && row < Settings.COLUMN.size-1) {
            if (elementArray[row][col-1].getId() == elementArray[row][col].getId()) {
                theSameId = true;
            }
        } return theSameId;
    }

    public void addToHashMap(){

    }
*/
}
