import instruments.Drum;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void setUp() throws Exception {
        drum = new Drum("Wood", "Red", InstrumentType.PERCUSSION, "Pearl", 300.00, 400.00, "Hi-hat");
    }

    @Test
    public void hasCymbals(){
        assertEquals("Hi-hat", drum.getCymbals());
    }
}
