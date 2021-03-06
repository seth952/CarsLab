package buisness;

import cars.ElectricCar;
import cars.PetrolCar;
import cars.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private double till;



    private ArrayList<Vehicle> stock;

    public Dealership(double till) {
        this.till = till;
        this.stock = new ArrayList<>();
    }
    public double getTill() {
        return till;
    }


    public int carCount() {
        return this.stock.size();
    }

    public void addCarToCollection(PetrolCar petrolCar) {
        this.stock.add(petrolCar);
    }



    public void buyVehicle(PetrolCar vehicle) {
        if (vehicle.getPriceToBuy() < till) {
            addCarToCollection(vehicle);
            till -= vehicle.getPriceToBuy();
        }
    }
}
