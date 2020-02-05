package cars;

import componenets.Engine;
import componenets.Tyre;

public class PetrolCar extends Vehicle {

    private int milesPerLit;


    public PetrolCar(double price, String colour, Engine engine, Tyre tyre, int milesPerLit) {
        super(price, colour, engine, tyre);
        this.milesPerLit = milesPerLit;
    }

    public int getMilesPerLit() {
        return milesPerLit;
    }
}
