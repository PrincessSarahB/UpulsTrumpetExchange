import instruments.InstrumentType;
import instruments.Xylophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XylophoneTest {

    Xylophone xylophone;

    @Before
    public void before() {
        xylophone = new Xylophone("wood", "brown", InstrumentType.PERCUSSION, "Stagg", 100.00, 180.00, 2.5);
    }

    @Test
    public void hasOctaves(){
        assertEquals(2.5, xylophone.getNumberOfOctaves(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("dink dink", xylophone.play());
    }
}
