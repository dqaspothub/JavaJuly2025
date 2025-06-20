package org.java.variable;

public class VariableDemo {

    static String course = "Core Java";  // static variable

    String trainerName = "Kannathasan";      // instance variable

    public void printDetails() {
        int duration = 60;  // local variable
        System.out.println("Course: " + course);
        System.out.println("Trainer: " + trainerName);
        System.out.println("Duration: " + duration + " days");
    }

    public static void main(String[] args) {
        VariableDemo obj = new VariableDemo();
        obj.printDetails();
    }
}

