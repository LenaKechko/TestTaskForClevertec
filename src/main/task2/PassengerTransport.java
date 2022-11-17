package main.task2;

public class PassengerTransport extends Transport implements SpecificityPassengerTransport{
    private int passengerCapacity;

    public PassengerTransport(int yearCreat, String brand, String model, String typeFuel, int fuelEconomy) {
        super(yearCreat, brand, model, typeFuel, fuelEconomy);
    }

    @Override
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }
}
