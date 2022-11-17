package main.task2;

public class CargoAndPassengerTransport extends Transport implements SpecificityPassengerTransport, SpecificityCargoTransport {
    private int passengerCapacity;
    private double bodyCapacity;
    private double loadCapacity;

    public CargoAndPassengerTransport(int yearCreat, String brand, String model, String typeFuel, int fuelEconomy) {
        super(yearCreat, brand, model, typeFuel, fuelEconomy);
    }

    @Override
    public void setBodyCapacity(double bodyCapacity) {
        this.bodyCapacity = bodyCapacity;
    }

    @Override
    public double getBodyCapacity() {
        return bodyCapacity;
    }

    @Override
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double getLoadCapacity() {
        return loadCapacity;
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
