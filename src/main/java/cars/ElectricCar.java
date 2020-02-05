package cars;

import componenets.Engine;
import componenets.Tyre;

public class ElectricCar extends Vehicle {

    private int milesPerKil;

    public ElectricCar(double price, String colour, Engine engine, Tyre tyre, int milesPerKil) {
        super(price, colour, engine, tyre);
        this.milesPerKil = milesPerKil;
    }

    public int getMilesPerKil() {
        return milesPerKil;
    }

}
