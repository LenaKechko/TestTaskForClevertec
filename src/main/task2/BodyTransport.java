package main.task2;

import java.util.Map;

import static java.util.Map.entry;

public class BodyTransport {
    private double bodyCapacity; // объем кузова
    private double loadCapacity; // грузоподъемность
    private String typeBody; // тип кузова
    private final Map<String, String> typeCargo = Map.ofEntries(
            entry("тентованный", "промтовары"),
            entry("рефрижератор", "промторвары и скоропортящиеся продукты"),
            entry("цистерна", "жидкость"),
            entry("изотермический", "продукты питания")

    ); // вид перевозимого груза в соотвествии с типом кузова

    public BodyTransport(double bodyCapacity, double loadCapacity, String typeBody) {
        this.bodyCapacity = bodyCapacity;
        this.loadCapacity = loadCapacity;
        this.typeBody = typeBody;
    }

    public double getBodyCapacity() {
        return bodyCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public String getTypeBody(String type) {
        return this.typeCargo.containsValue(type) ?
                String.valueOf(this.typeCargo.entrySet().stream()
                        .filter(entry -> type.equals(entry.getValue())).findFirst().get()) : "";
    }

    public String getTypeCargo(String typeBody) {
        return this.typeCargo.containsKey(typeBody) ? this.typeCargo.get(typeBody) : "";
    }
}
