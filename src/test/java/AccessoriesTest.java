import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {

    Accessories accessories1;
    Accessories accessories2;
    Accessories accessories3;


    @Before
    public void setUp(){
        accessories1 = new Accessories("Sheet Music", "Piano music for beginners", 2, 3.50);
        accessories2 = new Accessories("Drum Sticks", "Basic Drum Sticks", 5, 9.50);
        accessories3 = new Accessories("Guitar Strings", "Premium Guitar Strings", 10.00, 17.30);

    }
    @Test
    public void accessoriesHaveAType(){
        assertEquals("Sheet Music", accessories1.getType());
    }
    @Test
    public void accessoriesHaveADescription(){
        assertEquals("Basic Drum Sticks", accessories2.getDescription());
    }
    @Test
    public void accessoriesHaveBuyPrice(){
        assertEquals(10, accessories3.getBuyPrice(), 0);
    }
    @Test
    public void accessoriesHaveSellPrice(){
        assertEquals(17.30, accessories3.getSellPrice(), 0);
    }
    @Test
    public void checkProfit(){
        assertEquals(7.30, accessories3.calculateMarkup(), 0.001 );
    }

}
