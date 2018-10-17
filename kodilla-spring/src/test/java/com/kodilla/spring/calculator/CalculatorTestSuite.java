package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    public void testCalculations() {
        //Given

        //When
        double result1 = calculator.add(10, 15);
        double result2 = calculator.sub(10, 15);
        double result3 = calculator.mul(10, 2);
        double result4 = calculator.div(15, 3);
        double result5 = calculator.div(15, 0);
        //Then
        Assert.assertEquals(25, result1, 0.001);
        Assert.assertEquals(-5, result2, 0.001);
        Assert.assertEquals(20, result3, 0.001);
        Assert.assertEquals(5, result4, 0.001);
        Assert.assertEquals(0, result5, 0.001);
    }
}