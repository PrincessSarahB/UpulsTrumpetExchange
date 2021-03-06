import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("wood", "brown", InstrumentType.KEYBOARD, "Yamaha", 900.00, 1200.00, 88);
    }

    @Test
    public void hasKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("plinky plonky", piano.play());
    }


}
