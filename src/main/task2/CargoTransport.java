package main.task2;

public class CargoTransport extends Transport implements SpecificityCargoTransport{

    private double bodyCapacity;
    private double loadCapacity;

    public CargoTransport(int yearCreat, String brand, String model, String typeFuel, int fuelEconomy) {
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
}
