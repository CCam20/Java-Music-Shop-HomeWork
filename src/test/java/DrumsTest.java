import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drum;

    @Before
    public void setUp(){
        drum = new Drums("Rock", "Black", "Yamaha", 6, 4, 100, 170);
    }
    @Test
    public void drumsHaveAType(){
        assertEquals("Rock", drum.getType());
    }
    @Test
    public void drumsHaveAColour(){
        assertEquals("Black", drum.getColour());
    }
    @Test
    public void drumsHaveAManufacturer(){
        assertEquals("Yamaha", drum.getManufacturer());
    }
    @Test
    public void drumsHaveNumberOfDrums(){
        assertEquals(6, drum.getNumberOfDrums(), 0);
    }
    @Test
    public void drumsHaveNumberOfSymbols(){
        assertEquals(4, drum.getNumberOfSymbols(), 0);
    }
    @Test
    public void drumsHaveBuyPrice(){
        assertEquals(100, drum.getBuyPrice(), 0);
    }
    @Test
    public void drumsHaveSellPrice(){
        assertEquals(170, drum.getSellPrice(), 0);
    }
    @Test
    public void checkProfit(){
        assertEquals(70, drum.calculateMarkup(), 0 );
    }
    @Test
    public void canPlay(){
        assertEquals("Drums Playing", drum.playInstrument());
    }

}
