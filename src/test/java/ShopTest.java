import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Accessories accessories1;
    Accessories accessories2;
    Accessories accessories3;

    Pianos pianos;
    Guitars guitars;
    Drums drums;
    Shop shop;


    @Before
    public void setUp() {
        accessories1 = new Accessories("Sheet Music", "Piano music for beginners", 2, 3.50);
        accessories2 = new Accessories("Drum Sticks", "Basic Drum Sticks", 5, 9.50);
        accessories3 = new Accessories("Guitar Strings", "Premium Guitar Strings", 10.00, 17.30);
        pianos = new Pianos("Upright", "Silver", "Knight and Welmar", 1000, 1600);
        guitars = new Guitars("Acoustic", "Brown", "Gibson", 8, 70, 120);
        drums = new Drums("Rock", "Black", "Yamaha", 6, 4, 100, 170);
        shop =  new Shop();
    }
    @Test
    public void canAddToStockToShop(){
        shop.addToStock(drums);
        shop.addToStock(accessories1);
        shop.addToStock(pianos);
        assertEquals(3, shop.getStockLevels());
    }
    @Test
    public void canRemoveFromStock(){
        shop.addToStock(drums);
        shop.removeFromStock(drums);
        assertEquals(0 ,shop.getStockLevels());
    }
    @Test
    public void canCalculateProfit(){
        shop.addToStock(drums); shop.addToStock(accessories1); shop.addToStock(pianos);
        shop.addToStock(accessories2); shop.addToStock(guitars); shop.addToStock(accessories3);
        System.out.println(shop.getStock());
        assertEquals(733.30, shop.calculateMarkup(),0);

    }
}
