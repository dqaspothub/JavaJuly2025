package com.java.operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int age = 10;

        // Traditional if-else
        String status;

        if (age >= 18) {
            status = "Adult";
        } else {
            status = "Minor";
        }

        // Ternary equivalent
        String ternaryStatus = (age >= 18) ? "Adult" : "Minor";

        System.out.println("If-Else Result: " + status);           // Adult
        System.out.println("Ternary Result: " + ternaryStatus);    // Adult
    }
}