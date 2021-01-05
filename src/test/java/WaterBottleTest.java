import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void setUp(){
        waterBottle = new WaterBottle(397);
    }

    @Test
    public void volumeStartsAt100(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkReducesBy10(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void emptyMakesVolume0(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillMakesVolume100(){
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
