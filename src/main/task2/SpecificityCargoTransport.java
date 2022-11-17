package main.task2;

public interface SpecificityCargoTransport {

    double bodyCapacity = 0;
    double loadCapacity = 0;

    public void setBodyCapacity(double bodyCapacity);

    public double getBodyCapacity();

    public void setLoadCapacity(double loadCapacity);

    public double getLoadCapacity();
}
