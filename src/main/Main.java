package main;

import main.task3.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        try (FileWriter output = new FileWriter("Кечко.Елена.Java.Задача1.txt", false)) {
//            output.write(Boolean.toString(Task1.isWin(654456)));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try (FileWriter output = new FileWriter("Кечко.Елена.Java.Задача2.txt", false)) {
//            CargoTransport truck1 = new CargoTransport(2022, "МАЗ", "5440",
//                    "дизель",  12, 45, new InsulatedBody(5, 12));
//            PassengerTransport bus1 = new PassengerTransport(2020, "МАЗ", "18",
//                    "дизель",  5, 100, 30);
//            CargoAndPassengerTransport mircotruck1 = new CargoAndPassengerTransport(2021, "МАЗ",
//                    "666", "бензин",  5, 30,
//                    new RefrigeratedBody(5, 5), 4);
//            CarPark park1 = new CarPark();
//            park1.addTransport(truck1);
//            park1.addTransport(bus1);
//            park1.addTransport(mircotruck1);
//            output.write("Состав автопарка:\n");
//            output.write(park1.toString());
//            output.write("Проверка и ремонт грузовика:\n");
//            output.write(truck1.repair());
//            output.write("Дезинфекция автобуса:\n");
//            output.write(bus1.disinfect());
//            output.write("Заправка микроавтобуса:\n");
//            output.write(mircotruck1.fillTank(5.0));
//            output.write("\nПоступление и обработка заказов:\n");
//            ManageOrders manageOrders = new ManageOrders();
//            OrderPassenger orderPassenger = new OrderPassenger("Гомель", "Речица", 10);
//            output.write(orderPassenger.toString() + "\n");
//            output.write(manageOrders.setOrder(orderPassenger, park1) +  "\n");
//            OrderCargo orderCargo = new OrderCargo("Минск", "Гомель", 2, 2, "продукты питания");
//            output.write(orderCargo.toString() + "\n");
//            output.write(manageOrders.setOrder(orderCargo, park1) + "\n");
//            OrderCargoAndPassenger orderCargoAndPassenger = new OrderCargoAndPassenger(
//                    "Минск", "Гомель", 2, 2, "продукты питания", 10);
//            output.write(orderCargoAndPassenger.toString() + "\n");
//            output.write(manageOrders.setOrder(orderCargoAndPassenger, park1));
//            output.write("\nСписок выполняемых заказов:\n");
//            output.write(manageOrders.toString());
//            manageOrders.deleteOrder(orderPassenger);
//            output.write("\nСписок выполняемых заказов, после завершения некоторых:\n");
//            output.write(manageOrders.toString());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        ArrayList<Segment> segments = new ArrayList<>();
//        segments.add(new Segment(new Point(500, 0), new Point(500, 3210)));
//        segments.add(new Segment(new Point(0, 15), new Point(6000, 15)));
//        segments.add(new Segment(new Point(2000, 0), new Point(2000, 3210)));
//        segments.add(new Segment(new Point(500, 1515), new Point(2000, 1515)));
//        segments.stream().forEach(v -> System.out.println(v.toString()));
//        PlateGlass glass = new PlateGlass(segments);
//        System.out.println(glass.getWidth() + " " + glass.getHeight());
//        Figure figure = new Figure();
//        figure.createFigure(new Point(0, 0));
//        figure.createFigure(new Point(1500, 0));
//        figure.createFigure(new Point(1500, 1000));
//        figure.createFigure(new Point(0, 1485));
//        figure.setStartPlace(new Point(500, 15));
//        segments.addAll(figure.transformPointInSegments());
//        System.out.println(figure.toString());
//        segments.stream().forEach(v -> System.out.println(v.toString()));

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
