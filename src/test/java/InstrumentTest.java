import instruments.Guitar;
import instruments.Instrument;
import instruments.Piano;
import org.junit.Before;

public class InstrumentTest {

    Instrument guitar;
    Instrument piano;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("wood", "blue", );
        piano = new Piano();
    }
}
}
