package main.task2;

abstract public class Transport {
    private int yearCreat;
    private String brand;
    private String model;
    private String typeFuel;
    private int fuelEconomy;

    public Transport(int yearCreat, String brand, String model, String typeFuel, int fuelEconomy) {
        this.yearCreat = yearCreat;
        this.brand = brand;
        this.model = model;
        this.typeFuel = typeFuel;
        this.fuelEconomy = fuelEconomy;
    }

    public int getYearCreat() {
        return yearCreat;
    }

    public void setYearCreat(int yearCreat) {
        this.yearCreat = yearCreat;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public int getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(int fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }
}
