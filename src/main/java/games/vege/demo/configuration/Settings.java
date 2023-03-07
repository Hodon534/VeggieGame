package games.vege.demo.configuration;
//ok
public enum Settings {
    ROW_SIZE(12),
    COLUMN_SIZE(12);

    public final int size;
    Settings(int size) {
        this.size = size;
    }
}
