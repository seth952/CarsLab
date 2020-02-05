package cars;

import componenets.Engine;
import componenets.Tyre;

public abstract class Vehicle {

    private double price;
    private String colour;
    private Engine engine;
    private Tyre tyre;
    private int priceToBuy;
    private int priceToSell;



    public Vehicle(double price, String colour, Engine engine, Tyre tyre, int priceToBuy, int priceToSell) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyre = tyre;
        this.priceToBuy = priceToBuy;
        this.priceToSell = priceToSell;
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
    public int getPriceToBuy() {
        return priceToBuy;
    }

    public int getPriceToSell() {
        return priceToSell;
    }
}
