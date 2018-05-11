package accessories;

public class GuitarString extends Accessory {
    private String brand;
    public GuitarString(double buyPrice, double sellPrice, String brand) {
        super(buyPrice, sellPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }


}
