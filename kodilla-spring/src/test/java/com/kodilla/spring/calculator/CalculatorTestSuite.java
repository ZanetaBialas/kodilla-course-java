package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 20.5;
        double b = 5.0;

        //When
        double additionResult = calculator.addition(a, b);
        double divisionResult = calculator.division(a, b);
        double multiplicationResult = calculator.multiplication(a, b);
        double substractionResult = calculator.substraction(a, b);

        //Then
        assertEquals(additionResult, 25.5, 0.01);
        assertEquals(substractionResult, 15.5, 0.01);
        assertEquals(multiplicationResult, 102.5, 0.01);
        assertEquals(divisionResult, 4.1, 0.01);
    }
}
