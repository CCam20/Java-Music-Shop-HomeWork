import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianosTest {

    Pianos pianos;


        @Before
        public void setUp(){
            pianos = new Pianos("Upright", "Silver", "Knight and Welmar", 1000, 1600);
        }
        @Test
        public void pianosHaveAType(){
            assertEquals("Upright", pianos.getType());
        }
        @Test
        public void pianosHaveAColour(){
            assertEquals("Silver", pianos.getColour());
        }
        @Test
        public void pianosHaveAManufacturer(){
            assertEquals("Knight and Welmar", pianos.getManufacturer());
        }
        @Test
        public void pianosHaveBuyPrice(){
            assertEquals(1000, pianos.getBuyPrice(), 0);
        }
        @Test
        public void pianosHaveSellPrice(){
            assertEquals(1600, pianos.getSellPrice(), 0);
        }
        @Test
        public void checkProfit(){
            assertEquals(600, pianos.calculateMarkup(), 0 );
        }
    @Test
    public void canPlay(){
        assertEquals("Piano Playing", pianos.playInstrument());
    }
}
