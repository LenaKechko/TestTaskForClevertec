package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Задача 1. Проверка лотерейного билета
 * Написать функцию, которая на вход принимает номер лотерейного билета и
 * возвращает булевское значение, выигрышный билет или нет.
 */

public class Task1 {
    public boolean isValidNumber(Integer numberTicket) {
        int numberLength = numberTicket.toString().length();
        if ((numberLength < 2 || numberLength > 9) || numberLength % 2 != 0) {
//            System.out.println("Wrong number ticket!");
            return false;
        }
        return true;
    }

    public boolean isWin(Integer numberTicket) {
        int numberLength = numberTicket.toString().length();
        int sumFirstHalf = 0, sumLastHalf = 0;
        List<Integer> numbersFromTicket = Stream.of(numberTicket.toString().split("")).
                map(Integer::parseInt).
                collect(Collectors.toList());
        for (int i = 0; i < numberLength; i++) {
            if (i < numberLength / 2) {
                sumFirstHalf += numbersFromTicket.get(i);
            } else {
                sumLastHalf += numbersFromTicket.get(i);
            }
        }
        if (sumFirstHalf == sumLastHalf)
            return true;
        return false;
    }
}
