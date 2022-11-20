package main.task2.Fleet;

import main.task2.Body.BodyTransport;

public interface CargoTransportSpecific{
    BodyTransport getBodyTransport();

    default public String checkSealBody() {
        if (getBodyTransport().isSealBody()) {
            return "Кузов опломбирован";
        } else {
            return "Кузов не опломбирован";
        }
    }

    default public void sealAndUnsealBody() {
        boolean flagSeal = true;
        if (getBodyTransport().isSealBody()) {
            flagSeal = false;
        }
        getBodyTransport().setSealBody(flagSeal);
    }
}
