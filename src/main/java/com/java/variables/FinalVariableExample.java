package com.java.variables;

public class FinalVariableExample {

    final int MAX_VALUE = 100;  // constant

    void show() {
       // MAX_VALUE = 200; // ❌ Error: cannot assign a value to final variable
        System.out.println("MAX_VALUE = " + MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        obj.show();
    }
}

// final variables are often declared as constants (like PI, MAX_SIZE, etc.)