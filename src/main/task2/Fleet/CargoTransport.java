package main.task2.Fleet;

import main.task2.Body.BodyTransport;
import main.task2.Order.OrderCargo;

public class CargoTransport extends Transport implements CargoTransportSpecific{
    private BodyTransport bodyTransport;

    public CargoTransport(int yearOfManufacture, String model, String brand, String typeFuel, double fuelEconomy,
                          double volumeTank, BodyTransport body) {
        super(yearOfManufacture, model, brand, typeFuel, fuelEconomy, volumeTank);
        this.bodyTransport = body;
    }

    public BodyTransport getBodyTransport() {
        return bodyTransport;
    }

    public void pushOrder(OrderCargo order){
        super.pushOrder(order);
        this.bodyTransport.setFreeBodyCapacity(order.getVolume());
        this.bodyTransport.setFreeLoadCapacity(order.getWeight());
    }

    public void pullOrder(){
        super.pullOrder();
        this.bodyTransport.setFreeBodyCapacity(0);
        this.bodyTransport.setFreeLoadCapacity(0);
    }

    @Override
    public String toString() {
        return super.toString() + " " + bodyTransport.toString() + ". " + checkSealBody();
    }
}
