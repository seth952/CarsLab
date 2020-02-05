import buisness.Customer;
import cars.ElectricCar;
import cars.Vehicle;
import componenets.Engine;
import componenets.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ElectricCar electricCar1;
    ElectricCar electricCar2;
    Engine engine1;
    Tyre tyre1;

    @Before
    public void before() {
        customer = new Customer(40000);
        electricCar1 = new ElectricCar(30000, "Green", engine1, tyre1, 3);
        electricCar2 = new ElectricCar(30000, "Blueeeee", engine1, tyre1, 3);
    }

    @Test
    public void customerHasMoney() {
        assertEquals(400000, customer.getMoney(), 0.00);
    }

    @Test
    public void canCountCarsInCollection() {
        assertEquals(0, customer.carCount());
    }

    @Test
    public void canAddCarsToCollection() {
        customer.addCarToCollection(electricCar1);
        customer.addCarToCollection(electricCar2);
        assertEquals(2, customer.carCount());
    }

}
