package main.task2;

public class CargoTransport extends Transport implements CargoSpecificity {
    private BodyTransport bodyTransport;

    public CargoTransport(int yearOfManufacture, String model, String brand, String typeFuel, double fuelEconomy, BodyTransport body) {
        super(yearOfManufacture, model, brand, typeFuel, fuelEconomy);
        this.bodyTransport = body;
    }

}
