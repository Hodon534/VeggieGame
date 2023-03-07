package games.vege.demo.enities;

import games.vege.demo.configuration.Settings;
import games.vege.demo.tools.ShuffleMachine;

public class FieldMap {
    private final Field[][] fieldMap;


    //initialize
    public FieldMap() {
        fieldMap = new Field[Settings.ROW_SIZE.size][Settings.COLUMN_SIZE.size];
        for (int col = 0; col < Settings.COLUMN_SIZE.size; col++) {
            for (int row = 0; row < Settings.ROW_SIZE.size; row++) {
                fieldMap[col][row] = createField(col, row);
            }
        }
    }
    private Field createField(int col, int row){
        return new Field(ShuffleMachine.shuffleElements(), col, row);
    }

    public Field[][] getFieldMap(){
        return fieldMap;
    }

}
