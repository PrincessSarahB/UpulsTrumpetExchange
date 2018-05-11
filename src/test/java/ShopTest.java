import accessories.Accessory;
import accessories.AccessoryType;
import accessories.SheetMusic;
import instruments.Instrument;
import instruments.InstrumentType;
import instruments.Piano;
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
        piano = new Piano("wood", "brown", InstrumentType.KEYBOARD, "Yamaha", 900.00, 1200.00, 88);
        sheetMusic = new SheetMusic(4.00, 7.00, AccessoryType.SHEETMUSIC, "John Williams");
        shop = new Shop();

    }

    @Test
    public void itemCountStartsAt0(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStockToShop(){
        shop.addStock(piano);
        shop.addStock(sheetMusic);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canRemoveStockFromShop(){
        shop.addStock(piano);
        shop.addStock(sheetMusic);
        shop.removeStock(piano);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canCalculateTotalProfit(){
        shop.addStock(piano);
        shop.addStock(sheetMusic);
        assertEquals(303.00, shop.calculateTotalProfit(), 0.01);
    }
}
