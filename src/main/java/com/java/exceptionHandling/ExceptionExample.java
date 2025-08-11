package com.java.exceptionHandling;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int number = 10 / 0; // This will throw ArithmeticException
            System.out.println("This will not be printed");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("Finally block: Always executes");
        }

        System.out.println("Program continues after exception handling...");
    }
}
