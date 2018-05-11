import accessories.Accessory;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instrument piano;
    Accessory sheetMusic;

    @Before
    public void before() {
        shop = new Shop();

    }

    @Test
    public void itemCountStartsAt0(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStockToShop(){

    }
}
