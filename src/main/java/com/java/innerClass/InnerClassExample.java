package com.java.innerClass;

class Car {
    private String brand = "Tesla";

    // Inner class
    class Engine {
        void start() {
            System.out.println("Starting the engine of " + brand);
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        // Create Outer class object
        Car car = new Car();

        // Create Inner class object using outer object
        Car.Engine engine = car.new Engine();

        engine.start();
    }
}


/*
Key points:

Inner class can access private String brand directly.

You need an outer class object to create a non-static inner class object.*/
