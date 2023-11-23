package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //when
        double divResult = calculator.div(10, 0.1);
        double addResult = calculator.add(10,0.1);
        double subResult = calculator.sub(10, 0.1);
        double mulResult = calculator.mul(10, 0.1);
        //Then
        Assertions.assertEquals(100, divResult);
        Assertions.assertEquals(10.1, addResult);
        Assertions.assertEquals(9.9, subResult);
        Assertions.assertEquals(1, mulResult);

    }
}
