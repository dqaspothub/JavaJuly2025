package com.java.variables;

public class VarDemo {

    public static void main(String[] args) {

        var name = "Raj"; // Inferred as String
        var age = 25;     // Inferred as int
        var scores = new int[]{90, 85, 95}; // Inferred as int[]

        System.out.println(name.getClass()); // class java.lang.String
        System.out.println(scores.length);   // 3
    }
}