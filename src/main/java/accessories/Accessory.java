package accessories;

import interfaces.Sellable;

public abstract class Accessory implements Sellable {

    private double buyPrice;
    private double sellPrice;
    private AccessoryType accessoryType;

    public Accessory(double buyPrice, double sellPrice, AccessoryType accessoryType) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.accessoryType = accessoryType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public AccessoryType getAccessoryType() {
        return accessoryType;
    }

    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}
