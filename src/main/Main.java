package main;

import main.task1.*;


import main.task2.Body.InsulatedBody;
import main.task2.Body.RefrigeratedBody;
import main.task2.CarPark;
import main.task2.Fleet.CargoAndPassengerTransport;
import main.task2.Fleet.CargoTransport;
import main.task2.Fleet.PassengerTransport;
import main.task2.ManageOrders;
import main.task2.Order.OrderCargo;
import main.task2.Order.OrderCargoAndPassenger;
import main.task2.Order.OrderPassenger;
import main.task3.*;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try (FileWriter output = new FileWriter("Кечко.Елена.Java.Задача1.txt", false)) {
            output.write(Boolean.toString(Task1.isWin(654456)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileWriter output = new FileWriter("Кечко.Елена.Java.Задача2.txt", false)) {
            CargoTransport truck1 = new CargoTransport(2022, "МАЗ", "5440",
                    "дизель",  12, 45, new InsulatedBody(5, 12));
            PassengerTransport bus1 = new PassengerTransport(2020, "МАЗ", "18",
                    "дизель",  5, 100, 30);
            CargoAndPassengerTransport mircotruck1 = new CargoAndPassengerTransport(2021, "МАЗ",
                    "666", "бензин",  5, 30,
                    new RefrigeratedBody(5, 5), 4);
            CarPark park1 = new CarPark();
            park1.addTransport(truck1);
            park1.addTransport(bus1);
            park1.addTransport(mircotruck1);
            output.write("Состав автопарка:\n");
            output.write(park1.toString());
            output.write("Проверка и ремонт грузовика:\n");
            output.write(truck1.repair());
            output.write("Дезинфекция автобуса:\n");
            output.write(bus1.disinfect());
            output.write("Заправка микроавтобуса:\n");
            output.write(mircotruck1.fillTank(5.0));
            output.write("\nПоступление и обработка заказов:\n");
            ManageOrders manageOrders = new ManageOrders();
            OrderPassenger orderPassenger = new OrderPassenger("Гомель", "Речица", 10);
            output.write(orderPassenger.toString() + "\n");
            output.write(manageOrders.setOrder(orderPassenger, park1) +  "\n");
            OrderCargo orderCargo = new OrderCargo("Минск", "Гомель", 2, 2, "продукты питания");
            output.write(orderCargo.toString() + "\n");
            output.write(manageOrders.setOrder(orderCargo, park1) + "\n");
            OrderCargoAndPassenger orderCargoAndPassenger = new OrderCargoAndPassenger(
                    "Минск", "Гомель", 2, 2, "продукты питания", 10);
            output.write(orderCargoAndPassenger.toString() + "\n");
            output.write(manageOrders.setOrder(orderCargoAndPassenger, park1));
            output.write("\nСписок выполняемых заказов:\n");
            output.write(manageOrders.toString());
            manageOrders.deleteOrder(orderPassenger);
            output.write("\nСписок выполняемых заказов, после завершения некоторых:\n");
            output.write(manageOrders.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File file = new File("Входные данные для задачи 3.txt");
        Segments segments = ReadDataFromFile.readSegments(file);
        PlateGlass plateGlass = new PlateGlass(segments.getSegments());
        ArrayList<Figure> figures = ReadDataFromFile.readFigures(file);
        Machine machine = new Machine(segments);
        for(Figure figure : figures) {
            System.out.println(figures.indexOf(figure));
            machine.move(segments, figure);
            segments.getSegments().stream().forEach(v -> System.out.println(v.toString()));
        }
    }
}
