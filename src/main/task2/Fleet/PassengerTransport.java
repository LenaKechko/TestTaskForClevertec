package main.task2.Fleet;

import main.task2.Order.OrderCargo;
import main.task2.Order.OrderPassenger;

public class PassengerTransport extends Transport implements PassengerTransportSpecific {
    private int passengerCapacity;
    private int freePassengerCapacity;

    public PassengerTransport(int yearOfManufacture, String model, String brand, String typeFuel,
                              double fuelEconomy, double volumeTank, int passengerCapacity) {
        super(yearOfManufacture, model, brand, typeFuel, fuelEconomy, volumeTank);
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

    public void pushOrder(OrderPassenger order) {
        super.pushOrder(order);
        this.setFreePassengerCapacity(order.getCountPassenger());
    }

    public void pullOrder() {
        super.pullOrder();
        this.setFreePassengerCapacity(0);
    }

    @Override
    public String toString() {
        return super.toString() + ", passengerCapacity=" + passengerCapacity +
                ", freePassengerCapacity=" + freePassengerCapacity;
    }
}
