package cars;

import componenets.Engine;
import componenets.Tyre;

public class PetrolCar extends Vehicle {

    private int milesPerLit;


    public PetrolCar(double price, String colour, Engine engine, Tyre tyre, int milesPerLit,int priceToBuy, int priceToSell) {
        super(price, colour, engine, tyre, priceToBuy, priceToSell);
        this.milesPerLit = milesPerLit;
    }

    public int getMilesPerLit() {
        return milesPerLit;
    }
}
