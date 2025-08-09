package com.java.innerClass;


class Laptop {
    static class Battery {
        void charge() {
            System.out.println("Battery is charging...");
        }
    }
}

public class StaticNestedExample {
    public static void main(String[] args) {
        // No outer class object needed for static nested class
        Laptop.Battery battery = new Laptop.Battery();
        battery.charge();
    }
}

/*Key points:

Behaves like a normal class, but grouped inside another class.

Cannot access non-static members of the outer class directly.*/
