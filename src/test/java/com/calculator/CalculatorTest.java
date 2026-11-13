
package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(8, calc.add(5, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calc.subtract(5, 3));
    }
}
