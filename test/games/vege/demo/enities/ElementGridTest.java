package games.vege.demo.enities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementGridTest {

    @Test
    void getFieldMap() {
        //given
        ElementGrid elementGrid = new ElementGrid();
        //when

        //then
        assertAll(
                () -> assertNotNull(elementGrid.getFieldMap()),
                () -> assertEquals(12, elementGrid.getFieldMap().length)
        );

    }
}