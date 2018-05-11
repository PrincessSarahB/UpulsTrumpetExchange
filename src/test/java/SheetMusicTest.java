import accessories.AccessoryType;
import accessories.SheetMusic;
import com.sun.javafx.webkit.Accessor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(5.00, 7.00, AccessoryType.SHEETMUSIC, "Lennon and McCartney");

    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5.00, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(7.00, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canGetAccessoryType(){
        assertEquals(AccessoryType.SHEETMUSIC, sheetMusic.getAccessoryType());
    }

    @Test
    public void canGetComposer(){
        assertEquals("Lennon and McCartney", sheetMusic.getComposer());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2.00, sheetMusic.calculateMarkup(), 0.01);
    }

}
