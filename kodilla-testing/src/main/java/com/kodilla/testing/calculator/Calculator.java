package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return b - a;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
