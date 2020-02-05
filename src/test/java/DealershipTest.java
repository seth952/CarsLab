import buisness.Dealership;
import cars.PetrolCar;
import componenets.Engine;
import componenets.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealer;
    PetrolCar petrolCar1;
    PetrolCar petrolCar2;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        dealer = new Dealership(120000);
        engine = new Engine(180);
        tyre = new Tyre(18);
        petrolCar1 = new PetrolCar(25000, "blue", engine, tyre, 56, 30000, 12000);
        petrolCar2 = new PetrolCar(15000, "green", engine, tyre, 10, 18000, 12000);
    }

    @Test
    public void hasTill(){
        assertEquals(120000, dealer.getTill(), 0.01);
    }
    @Test
    public void canCountCarsInCollection() {
        assertEquals(0, dealer.carCount());
    }

    @Test
    public void canAddCarsToCollection() {
        dealer.addCarToCollection(petrolCar1);
        dealer.addCarToCollection(petrolCar2);
        assertEquals(2, dealer.carCount());
    }
    @Test
    public void buyCar(){
        dealer.buyVehicle(petrolCar1);
        assertEquals(1, dealer.carCount());
        assertEquals(90000, dealer.getTill(), 0.01);
    }
}
