package cars;

import componenets.Engine;
import componenets.Tyre;

public abstract class Vehicle {

    private double price;
    private String colour;
    private Engine engine;
    private Tyre tyre;

    public Vehicle(double price, String colour, Engine engine, Tyre tyre) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyre = tyre;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }
}
