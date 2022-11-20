package main.task2.Body;

public class RefrigeratedBody extends BodyTransport {
    private final static String typeBody = "рефрижератор"; // тип кузова
    private final static String typeCargo = "промторвары и скоропортящиеся продукты"; // вид перевозимого груза в соотвествии с типом кузова

    public RefrigeratedBody(double bodyCapacity, double loadCapacity) {
        super(bodyCapacity, loadCapacity);
    }

    public String getTypeBody() {
        return typeBody;
    }

    public String getTypeCargo() {
        return typeCargo;
    }
}
