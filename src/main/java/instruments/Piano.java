package instruments;

public class Piano extends Instrument {

    private int numberOfStrings;

    public Piano(String material, String colour, InstrumentType instrumentType, String make, double buyPrice, double sellPrice, int numberOfStrings) {
        super(material, colour, instrumentType, make, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "plinky plonky";
    }
}
