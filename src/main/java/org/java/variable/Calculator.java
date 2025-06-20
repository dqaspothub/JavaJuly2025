package org.java.variable;

public class Calculator {

    public void add() {
        int a = 5;      // Local variable
        int b = 10;     // Local variable
        int sum = a + b;
        System.out.println(sum);
    }


    public void printSum() {
        // System.out.println(sum); // Error: sum not accessible here
    }
}