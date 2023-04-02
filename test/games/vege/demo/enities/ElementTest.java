package games.vege.demo.enities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementTest {
    Element elementWithFixedId = new Element(5);


    @Test
    void getId() {
        //given
        Element[] arrayOfRandomElements = new Element[100];
        //when
        for (int i = 0; i < 100; i++) {
            arrayOfRandomElements[i] = new Element();
        }
        //then
        assertEquals(5, elementWithFixedId.getId());
        for (Element element : arrayOfRandomElements) {
            int randomId = element.getId();
            assertTrue(1 <= randomId && randomId <= 8);
        }
    }

    @Test
    void getName() {
        //given
        Element[] arrayOfRandomElements = new Element[100];
        //when
        for (int i = 0; i < 100; i++) {
            arrayOfRandomElements[i] = new Element();
        }
        //then
        assertEquals("Pineapple", elementWithFixedId.getName());
        for (Element element : arrayOfRandomElements) {
            String randomName = element.getName();
            assertTrue(randomName.equals("Pineapple") ||
                    randomName.equals("Plum") ||
                    randomName.equals("Peach") ||
                    randomName.equals("Pear") ||
                    randomName.equals("Carrot") ||
                    randomName.equals("Beetroot") ||
                    randomName.equals("Onion") ||
                    randomName.equals("Cucumber"));
        }
    }

    @Test
    void getColor() {
        //given
        Element[] arrayOfRandomElements = new Element[100];
        //when
        for (int i = 0; i < 100; i++) {
            arrayOfRandomElements[i] = new Element();
        }
        //then
        assertEquals("-fx-base: #9B2335;", elementWithFixedId.getColor());
        for (Element element : arrayOfRandomElements) {
            String randomColor = element.getColor();
            assertTrue(randomColor.equals("-fx-base: #9B2335;") ||
                    randomColor.equals("-fx-base: #00FF00;"));
        }
    }
}