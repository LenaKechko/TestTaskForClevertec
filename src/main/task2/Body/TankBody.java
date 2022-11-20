package main.task2.Body;

public class TankBody extends BodyTransport {
    private final static String typeBody = "цистерна"; // тип кузова
    private final static String typeCargo = "жидкость"; // вид перевозимого груза в соотвествии с типом кузова


    public TankBody(double bodyCapacity, double loadCapacity) {
        super(bodyCapacity, loadCapacity);
    }

    public String getTypeBody() {
        return typeBody;
    }

    public String getTypeCargo() {
        return typeCargo;
    }
}
