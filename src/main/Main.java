package main;

import main.task1.Task1;
import main.task2.BodyTransport;
import main.task2.CargoTransport;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try (FileWriter output = new FileWriter("Кечко.Елена.Java.Задача1.txt", false)) {
//            output.write(Boolean.toString(Task1.isWin(654456)));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        CargoTransport cargo1 = new CargoTransport(2005, "", "", "", 12, new BodyTransport(4.0, 1.0, ""));
    }
}
