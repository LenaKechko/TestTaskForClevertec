package main.task2.Fleet;

import main.task2.Body.BodyTransport;
import main.task2.Order.OrderCargo;
import main.task2.Order.OrderCargoAndPassenger;
import main.task2.Order.OrderPassenger;

public class CargoAndPassengerTransport extends Transport implements PassengerTransportSpecific, CargoTransportSpecific {
    private int passengerCapacity;
    private int freePassengerCapacity;
    private BodyTransport bodyTransport;

    public CargoAndPassengerTransport(int yearOfManufacture, String model, String brand, String typeFuel,
                                      double fuelEconomy, double volumeTank, BodyTransport body,
                                      int passengerCapacity) {
        super(yearOfManufacture, model, brand, typeFuel, fuelEconomy, volumeTank);
        this.bodyTransport = body;
        this.passengerCapacity = passengerCapacity;
        this.freePassengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getFreePassengerCapacity() {
        return freePassengerCapacity;
    }

    public void setFreePassengerCapacity(int capacity) {
        if (capacity == 0) {
            this.freePassengerCapacity = this.passengerCapacity;
        } else {
            this.freePassengerCapacity -= capacity;
        }
    }

    public BodyTransport getBodyTransport() {
        return bodyTransport;
    }

    public void pushOrder(OrderCargoAndPassenger order) {
        super.pushOrder(order);
        this.bodyTransport.setFreeBodyCapacity(order.getVolume());
        this.bodyTransport.setFreeLoadCapacity(order.getWeight());
        this.setFreePassengerCapacity(order.getCountPassenger());
    }

    public void pullOrder() {
        super.pullOrder();
        this.bodyTransport.setFreeBodyCapacity(0);
        this.bodyTransport.setFreeLoadCapacity(0);
        this.setFreePassengerCapacity(0);
    }

    @Override
    public String toString() {
        return super.toString() + ", passengerCapacity=" + passengerCapacity +
                ", freePassengerCapacity=" + freePassengerCapacity +
                ", bodyTransport=" + bodyTransport + "." + checkSealBody();
    }
}
