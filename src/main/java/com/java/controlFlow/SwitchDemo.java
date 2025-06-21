package com.java.controlFlow;

public class SwitchDemo {

    public static void main(String[] args) {


int choice = 2;
String productName;

        productName = switch (choice) {
            case 1 : yield  "Rahul gets Vanilla";
            case 2 : yield "Rahul gets Chocolate";
            case 3 : yield "Rahul gets Strawberry";
            case 4 : yield  "Rahul gets Mango";
            default : yield "Invalid choice";
};

        System.out.println(productName);
    }
}

