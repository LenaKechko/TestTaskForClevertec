package main.task2;

public class PassengerTransport extends Transport implements PassengerSpecificity{
    private int passengerCapacity;

    public PassengerTransport(int yearOfManufacture, String model, String brand, String typeFuel, double fuelEconomy, int passengerCapacity) {
        super(yearOfManufacture, model, brand, typeFuel, fuelEconomy);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}
