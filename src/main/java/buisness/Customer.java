package buisness;

import cars.ElectricCar;
import cars.Vehicle;

import java.util.ArrayList;

public class Customer  {

    private double money;
    private ArrayList<Vehicle> vehicles;

    public Customer(double money) {
        this.money = money;
        this.vehicles = new ArrayList<>();
    }

    public double getMoney() {
        return this.money;
    }

    public int carCount() {
        return this.vehicles.size();
    }

    public void addCarToCollection(ElectricCar electricCar) {
        this.vehicles.add(electricCar);
    }


    public void buyVehicle(ElectricCar electricCar) {
        if(electricCar.getPriceToBuy() < money){
            addCarToCollection(electricCar);
            money -= electricCar.getPriceToBuy();
        }
    }



}
