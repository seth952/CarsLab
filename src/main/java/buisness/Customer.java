package buisness;

import cars.ElectricCar;
import cars.Vehicle;

import java.util.ArrayList;

public class Customer  implements IBuy {

    private double money;
    private ArrayList<Vehicle> vehicles;

    public Customer(double money) {
        this.money = money;
        this.vehicles = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public int carCount() {
        return this.vehicles.size();
    }

    public void addCarToCollection(ElectricCar electricCar) {
        this.vehicles.add(electricCar);
    }

    @Override
    public void buyVehicle() {

    }
}
