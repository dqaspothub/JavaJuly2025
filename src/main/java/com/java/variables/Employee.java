package com.java.variables;

public class Employee {
    // Static variable
    public static String company = "Tech Corp"; // Shared by all employees

    // Instance variable
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println(name + " works at " + company);
    }

    public static void changeCompany(String newName) {
        company = newName; // Modify shared variable
    }

    public static void main(String[] args) {

        // Usage:
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");

        emp1.printDetails(); // Alice works at Tech Corp
        emp2.printDetails(); // Bob works at Tech Corp

        Employee.changeCompany("Google"); // Affects ALL employees

        emp1.printDetails(); // Alice works at Google
        emp2.printDetails(); // Bob works at Google
    }
}

