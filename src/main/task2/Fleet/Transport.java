package main.task2.Fleet;

import main.task2.Body.BodyTransport;
import main.task2.Order.Order;

public class Transport {
    private int yearOfManufacture; //год выпуска
    private String model; // модель
    private String brand; // марка
    private String typeFuel; // вид топлива
    private double fuelEconomy; // расход топлива
    private double volumeTank; // объем бака
    private double countFuel; // количество топлива в баке
    private Order order;

    public Transport(int yearOfManufacture, String model, String brand, String typeFuel, double fuelEconomy, double volumeTank) {
        this.yearOfManufacture = yearOfManufacture;
        this.model = model;
        this.brand = brand;
        this.typeFuel = typeFuel;
        this.fuelEconomy = fuelEconomy;
        this.volumeTank = volumeTank;
        this.countFuel = 0;
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

    public double getVolumeTank() {
        return volumeTank;
    }

    public double getCountFuel() {
        return countFuel;
    }

    /*заправляем машину*/
    public String fillTank(double countFuel) {
        if (this.countFuel + countFuel <= this.volumeTank) {
            this.countFuel += countFuel;
        } else {
            this.countFuel = this.volumeTank;
        }
        return this.model + " " + this.brand + " заправлена\n";
    }

    public String repair() {
        return this.model + " " + this.brand + " обслужена\n";
    }

    public BodyTransport getBodyTransport() {
        return null;
    }

    public void pushOrder(Order order) {
        this.order = order;
    }

    public void pullOrder() {
        this.order = null;
    }

    @Override
    public String toString() {
        return "yearOfManufacture=" + yearOfManufacture +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", typeFuel='" + typeFuel + '\'' +
                ", fuelEconomy=" + fuelEconomy +
                ", volumeTank=" + volumeTank +
                ", countFuel=" + countFuel;
    }
}
