package com.java.variables;

public class Student {
    // Instance variables (global to class)
    private String name;  // Default: null
    public int age;       // Default: 0

    public void display() {
        System.out.println(name + ", " + age); // Accessible
    }

    public static void staticMethod() {
        // System.out.println(name); // Error: Cannot access non-static member
    }
}