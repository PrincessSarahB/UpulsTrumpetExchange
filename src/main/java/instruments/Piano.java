package instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String material, String colour, InstrumentType instrumentType, String make, double buyPrice, double sellPrice, int numberOfKeys) {
        super(material, colour, instrumentType, make, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "plinky plonky";
    }
}
