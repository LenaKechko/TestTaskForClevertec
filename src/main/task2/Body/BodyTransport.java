package main.task2.Body;

public class BodyTransport {
    private double bodyCapacity; // объем кузова
    private double loadCapacity; // грузоподъемность
    private double freeBodyCapacity; // доступный для использования объем кузова
    private double freeLoadCapacity; // доступная для использования грузоподъемность
    private boolean sealBody; // опломбирован кузов или нет

    public BodyTransport(double bodyCapacity, double loadCapacity) {
        this.bodyCapacity = bodyCapacity;
        this.loadCapacity = loadCapacity;
        this.freeBodyCapacity = bodyCapacity;
        this.freeLoadCapacity = loadCapacity;
        this.sealBody = false;
    }

    public double getBodyCapacity() {
        return bodyCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public String getTypeBody() {
        return "";
    }

    public String getTypeCargo() {
        return "";
    }

    public double getFreeBodyCapacity() {
        return freeBodyCapacity;
    }

    public void setFreeBodyCapacity(double capacity) {
        if (capacity == 0) {
            this.freeBodyCapacity = this.bodyCapacity;
        } else {
            this.freeBodyCapacity -= capacity;
        }
    }

    public double getFreeLoadCapacity() {
        return freeLoadCapacity;
    }

    public void setFreeLoadCapacity(double capacity) {
        if (capacity == 0) {
            this.freeLoadCapacity = this.loadCapacity;
        } else {
            this.freeLoadCapacity -= capacity;
        }
    }

    public boolean isSealBody() {
        return sealBody;
    }

    public void setSealBody(boolean sealBody) {
        this.sealBody = sealBody;
    }

    @Override
    public String toString() {
        return "bodyCapacity=" + bodyCapacity +
                ", loadCapacity=" + loadCapacity;
    }
}
