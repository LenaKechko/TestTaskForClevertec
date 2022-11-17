package test;

import static org.junit.jupiter.api.Assertions.*;

import main.task1.Task1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Task1Test {

    @ParameterizedTest
    @ValueSource(ints = {123, 654, 18977, 322})
    void isValidNumberFalse(Integer input) {
        assertFalse(Task1.isValidNumber(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 1654, 67, 111322})
    void isValidNumberTrue(Integer input) {
        assertTrue(Task1.isValidNumber(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 1654, 67, 111322})
    void isWinFalse(Integer input) {
        assertFalse(Task1.isWin(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {22, 3654, 123321, 520322})
    void isWinTrue(Integer input) {
        assertTrue(Task1.isWin(input));
    }
}