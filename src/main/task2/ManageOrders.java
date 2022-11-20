package main.task2;

import main.task2.CarPark;
import main.task2.Fleet.CargoAndPassengerTransport;
import main.task2.Fleet.CargoTransport;
import main.task2.Fleet.PassengerTransport;
import main.task2.Fleet.Transport;
import main.task2.Order.Order;
import main.task2.Order.OrderCargo;
import main.task2.Order.OrderCargoAndPassenger;
import main.task2.Order.OrderPassenger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageOrders {
    private Map<Order, Transport> listOrder = new HashMap<>();

    public String setOrder(Order order, CarPark cars) {
        String resultText = "";
        if (order instanceof OrderCargo) {
            resultText = checkAndMakeCargoOrder(order, cars) ? "Заказ принят" : "Заказ не может быть принят";
        } else if (order instanceof OrderPassenger) {
            resultText = checkAndMakePassengerOrder(order, cars) ? "Заказ принят" : "Заказ не может быть принят";
        } else if (order instanceof OrderCargoAndPassenger) {
            resultText = checkAndMakeCargoPassengerOrder(order, cars) ? "Заказ принят" : "Заказ не может быть принят";
        }
        return resultText;
    }

    public boolean checkAndMakeCargoOrder(Order order, CarPark cars) {
        String typeCargo = ((OrderCargo) order).getTypeCargo();
        List<CargoTransport> appropriateCars = cars.getListTransport(CargoTransport.class, typeCargo);
        if (appropriateCars.isEmpty()) {
            return false;
        } else {
            for (CargoTransport car : appropriateCars) {
                if (car.getBodyTransport().getFreeBodyCapacity() >= ((OrderCargo) order).getVolume()
                        && car.getBodyTransport().getFreeLoadCapacity() >= ((OrderCargo) order).getWeight()) {
                    car.pushOrder(order);
                    car.sealAndUnsealBody();
                    listOrder.put(order, car);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkAndMakePassengerOrder(Order order, CarPark cars) {
        int countPassenger = ((OrderPassenger) order).getCountPassenger();
        List<PassengerTransport> appropriateCars = cars.getListTransport(PassengerTransport.class);
        if (appropriateCars.isEmpty()) {
            return false;
        } else {
            for (PassengerTransport car : appropriateCars) {
                if (car.getPassengerCapacity() >= countPassenger) {
                    car.pushOrder(order);
                    listOrder.put(order, car);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkAndMakeCargoPassengerOrder(Order order, CarPark cars) {
        String typeCargo = ((OrderCargoAndPassenger) order).getTypeCargo();
        int countPassenger = ((OrderCargoAndPassenger) order).getCountPassenger();
        List<CargoAndPassengerTransport> appropriateCars = cars.getListTransport(CargoAndPassengerTransport.class, typeCargo);
        if (appropriateCars.isEmpty()) {
            return false;
        } else {
            for (CargoAndPassengerTransport car : appropriateCars) {
                if (car.getBodyTransport().getFreeBodyCapacity() >= ((OrderCargoAndPassenger) order).getVolume()
                        && car.getBodyTransport().getFreeLoadCapacity() >= ((OrderCargoAndPassenger) order).getWeight()
                        && car.getPassengerCapacity() >= countPassenger) {
                    car.pushOrder(order);
                    car.sealAndUnsealBody();
                    listOrder.put(order, car);
                    return true;
                }
            }
        }
        return false;
    }

    public void deleteOrder (Order order) {
        Transport car = listOrder.get(order);
        car.pullOrder();
        if (car instanceof CargoTransport){
            ((CargoTransport) car).sealAndUnsealBody();
        }
        if (car instanceof CargoAndPassengerTransport){
            ((CargoAndPassengerTransport) car).sealAndUnsealBody();
        }
        listOrder.remove(order);
    }

    @Override
    public String toString() {
        String resultText = "";
        int count = 1;
        for (Order order : listOrder.keySet()){
            resultText += count + ". " + listOrder.get(order) + "\n" + order.toString() + "\n";
            count++;
        }
        return resultText;
    }
}
