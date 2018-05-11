import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("wood", "blue",InstrumentType.STRING, "Fender", 200.00, 250.00, 6);
    }



}
