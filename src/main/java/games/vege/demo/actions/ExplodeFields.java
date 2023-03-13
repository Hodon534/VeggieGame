package games.vege.demo.actions;

import games.vege.demo.configuration.Settings;
import games.vege.demo.enities.Element;
import games.vege.demo.enities.ElementGrid;
import games.vege.demo.enities.LocationOnMap;

import java.util.HashMap;

public class ExplodeFields {
    private final ElementGrid elementGrid;
    private final Element[][] elementArray;

    public ExplodeFields(ElementGrid elementGrid) {
        this.elementArray = elementGrid.getFieldMap();
        this.elementGrid = elementGrid;
    }

    //źle! coś poprawić, źle kolumna i wiersz, movefieldsdown usunąć stąd i przerzucić o ogólnej klasy
    public void plumRowExplosion(int row){
        for (int localRow = row; localRow == row; localRow++) {
            for (int col =  0; col < Settings.COLUMN.size; col++) {
                elementArray[localRow][col] = null;
            }
    }
}

    public void pineappleColumnExplosion(int col){
        for (int row = 0; row < Settings.COLUMN.size; row++) {
            for (int tempCol = col; tempCol == col; tempCol++) {
                elementArray[row][tempCol] = null;
            }
        }
    }

    public void peachSquareExplosion(int row, int col){
        if (checkIfElementInArray(row, col)) {
            elementArray[row][col] = null;
        }
        if (checkIfElementInArray(row-1, col)) {
            elementArray[row-1][col] = null;
        }
        if (checkIfElementInArray(row+1, col)) {
            elementArray[row+1][col] = null;
        }
        if (checkIfElementInArray(row, col-1)) {
            elementArray[row][col-1] = null;
        }
        if (checkIfElementInArray(row, col+1)) {
            elementArray[row][col+1] = null;
        }
        if (checkIfElementInArray(row-1, col-1)) {
            elementArray[row-1][col-1] = null;
        }
        if (checkIfElementInArray(row-1, col+1)) {
            elementArray[row-1][col+1] = null;
        }
        if (checkIfElementInArray(row+1, col+1)) {
            elementArray[row+1][col+1] = null;
        }
        if (checkIfElementInArray(row+1, col-1)) {
            elementArray[row+1][col-1] = null;
        }
    }

    public boolean checkIfElementInArray(int row, int col){
        boolean exist = false;
        if (row >= 0 && row < Settings.ROW.size && col >= 0 && col < Settings.COLUMN.size) {
            exist = true;
        } return exist;
    }

    public void explodeElementsAfterSwapping(HashMap hashMap) {

            addFieldsToHashMap(hashMap);

    }

    public void addFieldsToHashMap(HashMap hashMap) {
        //hashMap.get(1
            for(Object fieldId: hashMap.keySet()) {
            findIt(hashMap, fieldId);
        }
    }

    public void findIt(HashMap hashMap, Object fieldId) {
        //if (hashMap.get(fieldId).)
    }

}

