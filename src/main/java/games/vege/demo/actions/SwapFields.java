package games.vege.demo.actions;

import games.vege.demo.configuration.Settings;
import games.vege.demo.enities.Element;
import games.vege.demo.enities.ElementGrid;
import games.vege.demo.enities.LocationOnMap;

import java.util.ArrayList;
import java.util.HashMap;

public class SwapFields {
    private final ElementGrid elementGrid;
    private final Element[][] elementArray;
    private LocationOnMap locationOnMap;
    private boolean isFieldAlreadyClicked;
    private HashMap<Integer, ArrayList<LocationOnMap>> hashMap;
    private ExplodeFields explodeFields;
    public SwapFields(ElementGrid fieldMap, ExplodeFields explodeFields) {
        this.elementArray = fieldMap.getFieldMap();
        this.elementGrid = fieldMap;
        hashMap = new HashMap<>();
        this.explodeFields = explodeFields;
    }

    public void fieldClicked(int row, int col) {
        locationOnMap = new LocationOnMap(row, col);
        int fieldId = elementArray[row][col].getId();
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
        elementArray[row][col] = elementArray[locationOnMap.getRow()][locationOnMap.getCol()];
        elementArray[locationOnMap.getRow()][locationOnMap.getCol()] = element;
        if (hashMap.get(elementArray[row][col].getId()) == null) {
            hashMap.put(elementArray[row][col].getId(), new ArrayList<>());
            hashMap.get(elementArray[row][col].getId()).add(new LocationOnMap(row, col));
        }
        if (hashMap.get(elementArray[locationOnMap.getRow()][locationOnMap.getCol()].getId()) == null) {
            hashMap.put(elementArray[locationOnMap.getRow()][locationOnMap.getCol()].getId(), new ArrayList<>());
            hashMap.get(elementArray[locationOnMap.getRow()][locationOnMap.getCol()].getId()).add(new LocationOnMap(row, col));
        }
        explodeFields.explodeElementsAfterSwapping(hashMap);

    }

    public boolean areFieldsNextToEachOther(int row, int col) {
        boolean areTheyNextToEachOther = false;
        if (locationOnMap.getRow() == row && (locationOnMap.getCol() - col == 1 || locationOnMap.getCol() - col == -1)) {
            areTheyNextToEachOther = true;
        } else if (locationOnMap.getCol() == col && (locationOnMap.getRow() - row == 1 || locationOnMap.getRow() - row == -1)) {
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

    public void removeField(int row, int col) {
        elementArray[row][col] = null;
        moveFieldsDown();
    }
    //todo
    // Na razie nie ruszać!
    // dlaczego to działa! za duże, zmienić na dodawanie tylko w konkretnej kolumnie
    public void moveFieldsDown() {
        for (int row = Settings.ROW.size - 1; row >= 0; row--) {
            for (int col = Settings.COLUMN.size - 1; col >= 0; col--) {
                if (elementArray[row][col] == null) {
                    for (int tempCol = col-1; tempCol >= 0; tempCol--) {
                        if (elementArray[row][tempCol] != null) {
                            elementArray[row][col] = elementArray[row][tempCol];
                            elementArray[row][tempCol] = null;
                            break;
                        }}}}
        } for (int row = Settings.ROW.size-1; row >= 0; row--) {
            for (int col = Settings.COLUMN.size-1; col >= 0; col--) {
                if (elementArray[row][col] == null) {
                    elementArray[row][col] = new Element();
                }}}
    }
}
