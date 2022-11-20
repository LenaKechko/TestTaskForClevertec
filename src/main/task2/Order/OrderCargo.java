package main.task2.Order;

public class OrderCargo extends Order{
    private double volume;
    private double weight;
    private String typeCargo;

    public OrderCargo(String startWay, String endWay, double volume, double weight, String typeCargo) {
        super(startWay, endWay);
        this.volume = volume;
        this.weight = weight;
        this.typeCargo = typeCargo;
    }

    public double getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String getTypeCargo() {
        return typeCargo;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume=" + volume +
                ", weight=" + weight +
                ", typeCargo='" + typeCargo;
    }
}
