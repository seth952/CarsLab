package cars;

import componenets.Engine;
import componenets.Tyre;

public class ElectricCar extends Vehicle {

    private int milesPerKil;

    public ElectricCar(double price, String colour, Engine engine, Tyre tyre, int milesPerKil, int priceToBuy, int priceToSell) {
        super(price, colour, engine, tyre, priceToBuy, priceToSell);
        this.milesPerKil = milesPerKil;
    }

    public int getMilesPerKil() {
        return milesPerKil;
    }

}
