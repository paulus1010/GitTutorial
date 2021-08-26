package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int add(int a, int b) {
        int sum = a + b;
        System.out.println("Suma " + a + " + " + b + " = " + sum);
        return sum;
    }

    public int substract(int a, int b) {
        int substract = a - b;
        System.out.println("Różnica " + a + " - " + b + " = " + substract);
        return substract;
    }
}
