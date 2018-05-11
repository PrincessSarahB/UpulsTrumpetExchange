package accessories;

public class SheetMusic extends Accessory {
    private String composer;

    public SheetMusic(double buyPrice, double sellPrice, AccessoryType accessoryType, String composer) {
        super(buyPrice, sellPrice, accessoryType);
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }
}
