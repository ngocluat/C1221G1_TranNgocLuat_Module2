package ss8_clean_code.thuc_hanh.Calculator;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test {


    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operatoro = '+';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operatoro);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int a = 6;
        int b = 3;
        char o = '/';
        int expected = 2;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    private void assertEquals(int expected, int result) {
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int a = 2;
        int b = 0;
        char o = '/';

        assertThrows(RuntimeException.class,
                () -> {
                    Calculator.calculate(a, b, o);
                });
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int a = 2;
        int b = 0;
        char o = '=';

        assertThrows(RuntimeException.class,
                () -> {
                    Calculator.calculate(a, b, o);
                });
    }
}