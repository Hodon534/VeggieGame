package games.vege.demo.configuration;
//ok
public enum Settings {
    ROW(12),
    COLUMN(12),
    MAX_POINTS(5000);
    public final int size;
    Settings(int size) {
        this.size = size;
    }
}
