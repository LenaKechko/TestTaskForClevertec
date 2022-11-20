package main.task2.Order;

public class OrderPassenger extends Order{
    private int countPassenger;

    public OrderPassenger(String startWay, String endWay, int countPassenger) {
        super(startWay, endWay);
        this.countPassenger = countPassenger;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    @Override
    public String toString() {
        return super.toString() + ", countPassenger=" + countPassenger;
    }
}
