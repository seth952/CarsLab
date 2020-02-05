
import cars.PetrolCar;
import componenets.Engine;
import componenets.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {
    PetrolCar petrolCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before() {
        engine = new Engine(400);
        tyre = new Tyre(30);
        petrolCar = new PetrolCar(30000, "Pink", engine, tyre, 1, 20000, 15000);
    }

    @Test
    public void hasPrice() {
        assertEquals(30000, petrolCar.getPrice(), 0.00);
    }

    @Test
    public void hasColour() {
        assertEquals("Pink", petrolCar.getColour());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, petrolCar.getEngine());
    }

    @Test
    public void hasTyre() {
        assertEquals(tyre, petrolCar.getTyre());
    }

    @Test
    public void hasMilesByLit() {
        assertEquals(1, petrolCar.getMilesPerLit());
    }
    @Test
    public void hasPriceToBuy(){
        assertEquals(20000, petrolCar.getPriceToBuy());
    }
    @Test
    public void hasPriceToSell(){
        assertEquals(15000, petrolCar.getPriceToSell());
    }
}

