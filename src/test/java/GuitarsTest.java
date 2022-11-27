import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarsTest {

    Guitars guitars;

    @Before
    public void setUp(){
        guitars = new Guitars("Acoustic", "Brown", "Gibson", 8, 70, 120);
    }
    @Test
    public void guitarsHaveAType(){
        assertEquals("Acoustic", guitars.getType());
    }
    @Test
    public void guitarsHaveAColour(){
        assertEquals("Brown", guitars.getColour());
    }
    @Test
    public void guitarsHaveAManufacturer(){
        assertEquals("Gibson", guitars.getManufacturer());
    }
    @Test
    public void guitarsHaveNumberOfStrings(){
        assertEquals(8, guitars.getNumberOfStrings(), 0);
    }
    @Test
    public void guitarsHaveBuyPrice(){
        assertEquals(70, guitars.getBuyPrice(), 0);
    }
    @Test
    public void guitarsHaveSellPrice(){
        assertEquals(120, guitars.getSellPrice(), 0);
    }
    @Test
    public void checkProfit(){
        assertEquals(50, guitars.calculateMarkup(), 0 );
    }
    @Test
    public void canPlay(){
        assertEquals("Guitar Playing", guitars.playInstrument());
    }

}
