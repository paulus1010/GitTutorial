package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import java.util.Objects;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - test metod add i substract klasy Calculator: ");
        Calculator calc1 = new Calculator(5, 7);

        int addResult = calc1.getA() + calc1.getB();
        int subResult = calc1.getA() - calc1.getB();

        if (addResult == calc1.add(5, 7)) {
            System.out.println("Test metody add: OK!");
        } else {
            System.out.println("Test metody add: ERROR!");
        }

        if (subResult == calc1.substract(5, 7)) {
            System.out.println("Test metody substract: OK!");
        } else {
            System.out.println("Test metody substract: ERROR!");
        }
    }
}
