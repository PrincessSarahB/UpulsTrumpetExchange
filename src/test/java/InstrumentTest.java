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
        guitar = new Guitar("wood", "blue", InstrumentType.STRING, "Fender", 200.00, 250.00);
        piano = new Piano("wood", "brown", InstrumentType.KEYBOARD, "Yamaha", 900.00, 1200.00);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", guitar.getColour());
    }


}

