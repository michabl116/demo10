package week2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void addvalue() {
        double result = Calculator.addvalue(5.0, 3.0);
        assertEquals(8.0, result, "La suma debe ser 8.0");
    }

    @Test
    void subvalue() {
        double result = Calculator.subvalue(10.0, 4.0);
        assertEquals(6.0, result, "La resta debe ser 6.0");
    }

    @Test
    void multivalue() {
        double result = Calculator.multivalue(2.0, 3.5);
        assertEquals(7.0, result, "La multiplicación debe ser 7.0");
    }
}