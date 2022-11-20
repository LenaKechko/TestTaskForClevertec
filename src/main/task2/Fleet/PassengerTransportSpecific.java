package main.task2.Fleet;

public interface PassengerTransportSpecific {
    String getBrand();

    String getModel();

    default public String disinfect() {
        return "Салон " + this.getModel() + " " + this.getBrand() + " был продезинфецирован!\n";
    }
}
