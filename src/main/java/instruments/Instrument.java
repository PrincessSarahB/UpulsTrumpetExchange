package instruments;

import interfaces.Playable;

public abstract class Instrument {

    private String material;
    private String colour;
    private InstrumentType instrumentType;
    private String make;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String material, String colour, InstrumentType instrumentType, String make, double buyPrice, double sellPrice) {
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.make = make;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getMake() {
        return make;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }


}
