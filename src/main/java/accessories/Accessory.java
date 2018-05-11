package accessories;

import interfaces.Sellable;

public abstract class Accessory implements Sellable {

    private double buyPrice;
    private double sellPrice;

    public Accessory(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}
