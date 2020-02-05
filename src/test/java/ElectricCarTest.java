import cars.ElectricCar;
import componenets.Engine;
import componenets.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before() {
        engine = new Engine(400);
        tyre = new Tyre(30);
        electricCar = new ElectricCar(30000, "Pink", engine, tyre, 1);
    }

    @Test
    public void hasPrice() {
        assertEquals(30000, electricCar.getPrice(), 0.00);
    }

    @Test
    public void hasColour() {
        assertEquals("Pink", electricCar.getColour());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, electricCar.getEngine());
    }

    @Test
    public void hasTyre() {
        assertEquals(tyre, electricCar.getTyre());
    }

    @Test
    public void hasMilesByKil() {
        assertEquals(1, electricCar.getMilesPerKil());
    }
}
