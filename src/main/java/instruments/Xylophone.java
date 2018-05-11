package instruments;

public class Xylophone extends Instrument {

    private double numberOfOctaves;

    public Xylophone(String material, String colour, InstrumentType instrumentType, String make, double buyPrice, double sellPrice, double numberOfOctaves) {
        super(material, colour, instrumentType, make, buyPrice, sellPrice);
        this.numberOfOctaves = numberOfOctaves;
    }

    public double getNumberOfOctaves() {
        return numberOfOctaves;
    }

    public String play(){
        return "dink dink";
    }
}
