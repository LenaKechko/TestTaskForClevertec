package main.task2.Order;

public class OrderCargoAndPassenger extends Order {
    private double volume;
    private double weight;
    private String typeCargo;
    private int countPassenger;

    public OrderCargoAndPassenger(String startWay, String endWay, double volume, double weight, String typeCargo, int countPassenger) {
        super(startWay, endWay);
        this.volume = volume;
        this.weight = weight;
        this.typeCargo = typeCargo;
        this.countPassenger = countPassenger;
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

    public int getCountPassenger() {
        return countPassenger;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume=" + volume +
                ", weight=" + weight +
                ", typeCargo='" + typeCargo + '\'' +
                ", countPassenger=" + countPassenger;
    }
}
