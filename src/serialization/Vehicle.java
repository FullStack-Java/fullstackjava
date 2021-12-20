package serialization;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String nameOfVehicle;
    private int numberOfWheels;
    private int mileage;

    public Vehicle(String nameOfVehicle, int numberOfWheels, int mileage) {
        this.nameOfVehicle = nameOfVehicle;
        this.numberOfWheels = numberOfWheels;
        this.mileage = mileage;
    }

    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getMileage() {
        return mileage;
    }
}
