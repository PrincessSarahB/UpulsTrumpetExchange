import instruments.Guitar;
import instruments.Instrument;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument guitar;
    Instrument piano;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("wood", "blue", InstrumentType.STRING, "Fender", 200.00, 250.00, 6);
        piano = new Piano("wood", "brown", InstrumentType.KEYBOARD, "Yamaha", 900.00, 1200.00, 88);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", guitar.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasMake(){
        assertEquals("Yamaha", piano.getMake());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(200.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(250.00, guitar.getSellPrice(), 0.01);
    }


}

