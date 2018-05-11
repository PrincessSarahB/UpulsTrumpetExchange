import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("brass", "gold", InstrumentType.BRASS, "Yamaha", 250.00, 300.00, 3);
    }

    @Test
    public void hasValves(){
        assertEquals(3, trumpet.getNumberOfValves());
    }
}
