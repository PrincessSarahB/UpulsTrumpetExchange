import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("wood", "brown", InstrumentType.KEYBOARD, "Yamaha", 900.00, 1200.00, 88);
    }


}
