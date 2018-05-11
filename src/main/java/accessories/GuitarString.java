package accessories;

public class GuitarString extends Accessory {
    private String brand;
    public GuitarString(double buyPrice, double sellPrice, AccessoryType accessoryType, String brand) {
        super(buyPrice, sellPrice, accessoryType);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }


}
