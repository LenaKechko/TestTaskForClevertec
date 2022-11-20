package main.task2.Body;

public class TiltBody extends BodyTransport {
    private final static String typeBody = "тентованный"; // тип кузова
    private final static String typeCargo = "промтовары"; // вид перевозимого груза в соотвествии с типом кузова

    public TiltBody(double bodyCapacity, double loadCapacity) {
        super(bodyCapacity, loadCapacity);
    }

    public String getTypeBody() {
        return typeBody;
    }

    public String getTypeCargo() {
        return typeCargo;
    }

}
