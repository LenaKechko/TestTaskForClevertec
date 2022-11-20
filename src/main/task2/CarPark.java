package main.task2;

import main.task2.Fleet.PassengerTransport;
import main.task2.Fleet.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarPark {
    private ArrayList<Transport> listTransport = new ArrayList<>();

    public CarPark() {
    }

    public void addTransport(Transport transport) {
        this.listTransport.add(transport);
    }

    public ArrayList<Transport> getListTransport() {
        return this.listTransport;
    }

    public <T extends Transport> List<T> getListTransport(Class<T> className) {
        return listTransport.stream()
                .filter(className::isInstance)
                .map(car -> (T) car)
                .collect(Collectors.toList());
    }

    public <T extends Transport> List<T> getListTransport(Class<T> className, String typeCargo) {
        if (className == PassengerTransport.class)
            return null;
        return listTransport.stream()
                .filter(className::isInstance)
                .map(car -> (T) car)
                .filter(car -> car.getBodyTransport().getTypeCargo().equals(typeCargo))
                .collect(Collectors.toList());
    }

    public String toString(){
        String resultText ="";
        for (Transport car : listTransport)
            resultText += (car.toString() + "\n");
        return resultText;
    }
}
