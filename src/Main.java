import task1.Task1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Task1 number = new Task1();
        number.isWin(123456);
        try (FileWriter output = new FileWriter("Кечко.Елена.Java.Задача1.txt", false)) {
            output.write(Boolean.toString(number.isWin(654456)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
