package main.task2.Order;

public class Order {
    private String startWay;
    private String endWay;

    public Order(String startWay, String endWay) {
        this.startWay = startWay;
        this.endWay = endWay;
    }

    public String getStartWay() {
        return startWay;
    }

    public String getEndWay() {
        return endWay;
    }

    @Override
    public String toString() {
        return "startWay='" + startWay + '\'' +
                ", endWay='" + endWay;
    }
}
