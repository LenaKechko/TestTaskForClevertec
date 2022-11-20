package main.task2.Body;

public class InsulatedBody extends BodyTransport {
    private final static String typeBody = "изотермический"; // тип кузова
    private final static String typeCargo = "продукты питания"; // вид перевозимого груза в соотвествии с типом кузова

    public InsulatedBody(double bodyCapacity, double loadCapacity) {
        super(bodyCapacity, loadCapacity);
    }

    public String getTypeBody() {
        return typeBody;
    }

    public String getTypeCargo() {
        return typeCargo;
    }

}
