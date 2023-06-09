package games.vege.demo.util;

import java.util.Random;

/**
 * Component to auto-generate random fields
 */
public class ShuffleMachine {

    private static final Random random = new Random();
    /**
     * Auto-generate random fields
     */
    public static int shuffleElements(){
        int shuffle = random.nextInt(1,100);
        int elementNo = 0;
        if (shuffle >= 1 && shuffle <= 20) {
            elementNo = 1;
        } else if (shuffle >= 21 && shuffle <= 40) {
            elementNo = 2;
        } else if (shuffle >= 41 && shuffle <= 60) {
            elementNo = 3;
        } else if (shuffle >= 61 && shuffle <= 80) {
            elementNo = 4;
        } else if (shuffle >= 81 && shuffle <= 85) {
            elementNo = 5;
        } else if (shuffle >= 86 && shuffle <= 90) {
            elementNo = 6;
        } else if (shuffle >= 91 && shuffle <= 95) {
            elementNo = 7;
        } else if (shuffle >= 96 && shuffle <= 100) {
            elementNo = 8;
        }
        return elementNo;
    }

    /**
     * Auto-generate random fields at the start of the game - no fruits, only veggies
     */
    public static int initialShuffleElements(){
        int shuffle = random.nextInt(1,100);
        int elementNo = 0;
        if (shuffle >= 1 && shuffle <= 25) {
            elementNo = 1;
        } else if (shuffle >= 26 && shuffle <= 50) {
            elementNo = 2;
        } else if (shuffle >= 51 && shuffle <= 75) {
            elementNo = 3;
        } else if (shuffle >= 76 && shuffle <= 100) {
            elementNo = 4;
        }
        return elementNo;
    }
}
