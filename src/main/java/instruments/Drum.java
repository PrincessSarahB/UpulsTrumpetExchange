package instruments;

public class Drum extends Instrument {

    private String cymbals;

    public Drum(String material, String colour, InstrumentType instrumentType, String make, double buyPrice, double sellPrice, String cymbals) {
        super(material, colour, instrumentType, make, buyPrice, sellPrice);
        this.cymbals = cymbals;
    }

    public String getCymbals() {
        return cymbals;
    }

    public String play(){
        return "Trrrrrrrr boom!";

    }
}
