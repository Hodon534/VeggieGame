package games.vege.demo.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleMachineTest {

    @Test
    void shuffleElements() {
        //given
        int[] arrayOfShuffleElements = new int[100];
        //when
        for (int i = 0; i < 100; i++) {
            arrayOfShuffleElements[i] = ShuffleMachine.shuffleElements();
        }
        //then
        for (int value: arrayOfShuffleElements) {
            assertTrue(1 <= value && value <= 8);
        }
    }

    @Test
    void initialShuffleElements() {
        int[] arrayOfInitialShuffleElements = new int[100];
        //when
        for (int i = 0; i < 100; i++) {
            arrayOfInitialShuffleElements[i] = ShuffleMachine.initialShuffleElements();
        }
        //then
        for (int value: arrayOfInitialShuffleElements) {
            assertTrue(1 <= value && value <= 4);
        }
    }
}