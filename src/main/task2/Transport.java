package main.task2;

public class Transport {
    private int yearOfManufacture; //год выпуска
    private String model; // модель
    private String brand; // марка
    private String typeFuel; // вид топлива
    private double fuelEconomy; // расход топлива
    private double countFuel = 0; // количество топлива

    public Transport(int yearOfManufacture, String model, String brand, String typeFuel, double fuelEconomy) {
        this.yearOfManufacture = yearOfManufacture;
        this.model = model;
        this.brand = brand;
        this.typeFuel = typeFuel;
        this.fuelEconomy = fuelEconomy;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public double getFuelEconomy() {
        return fuelEconomy;
    }

    public double getCountFuel() {
        return countFuel;
    }

    public void fill(double addFuel) {
        this.countFuel += addFuel;
    }

    public void repair() {

    }


}
