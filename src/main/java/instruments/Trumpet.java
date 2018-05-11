package instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String material, String colour, InstrumentType instrumentType, String make, double buyPrice, double sellPrice, int numberOfValves) {
        super(material, colour, instrumentType, make, buyPrice, sellPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}
