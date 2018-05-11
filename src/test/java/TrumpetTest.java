import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("brass", "gold", InstrumentType.BRASS, "Yamaha", 250.00, 300.00, 3);
    }
}
