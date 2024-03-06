package org.example.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TestCalculator {
    Calculator calc = Calculator.instance.get();
    @Test
    public void devide() {
        int a = 2;
        int b = 0;

        int x = calc.devide.apply(a, b);
        assertEquals(0, x);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2, true",
            "3, true",
            "-1, false"
    })
    public void ParameterizedTest(int a, boolean expected) {
        boolean x = calc.isPositive.test(a);
        assertEquals(expected, x);
    }
}