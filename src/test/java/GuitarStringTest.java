import accessories.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString(5.00, 6.00, "Ernie Ball");

    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5.00, guitarString.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(6.00, guitarString.getSellPrice(), 0.01);
    }

}
