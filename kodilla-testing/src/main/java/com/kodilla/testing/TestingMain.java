package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy: dodawanie");

        Calculator calculator = new Calculator(15, 10);
        int testAdd = 25;
        if (testAdd == calculator.add(15, 10)) {
            System.out.println("Test - add a to b: OK");
        } else {
            System.out.println("Error test add a to b");
        }
        System.out.println("Test - drugi test jednostkowy: odejmowanie");
        int testSubstract = -5;
        if (testSubstract == calculator.substract(15, 10)) {
            System.out.println("Test - Substract b from a: OK");
        } else {
            System.out.println("Error test substract b from a");
        }
    }
}