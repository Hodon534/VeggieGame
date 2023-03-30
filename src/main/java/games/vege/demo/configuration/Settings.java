package games.vege.demo.configuration;

/**
 * Global settings of the game:
 * - 12 x 12 board
 * - max 5000 points
 */
public enum Settings {
    ROW(12),
    COLUMN(12),
    MAX_POINTS(5000);
    public final int size;
    Settings(int size) {
        this.size = size;
    }
}
