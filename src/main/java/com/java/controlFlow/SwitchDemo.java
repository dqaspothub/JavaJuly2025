package com.java.controlFlow;

public class SwitchDemo {

    public static void main(String[] args) {

        int day = 1;

        String dayName;

        dayName= switch (day) {
            case 1: yield "Monday";
            case 2: yield "Tuesday";
            default: yield "Another day";
        };

        System.out.println(dayName);
    }
}




    /*int choice = 2;
    String productName;

    productName = switch (choice) {
        case 1 : yield  "Rahul gets Vanilla";
        case 2 : yield "Rahul gets Chocolate";
        case 3 : yield "Rahul gets Strawberry";
        case 4 : yield  "Rahul gets Mango";
        default : yield "Invalid choice";
    };

        System.out.println(productName);
}*/