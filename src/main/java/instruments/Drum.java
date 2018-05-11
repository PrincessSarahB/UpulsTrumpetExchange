package instruments;

public class Drum extends Instrument {

    public Drum(String material, String colour, InstrumentType instrumentType, String make, double buyPrice, double sellPrice) {
        super(material, colour, instrumentType, make, buyPrice, sellPrice);
    }

    public String play(){
        return "Trrrrrrrr boom!";

    }
}
