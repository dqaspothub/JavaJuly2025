package com.java.encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    Employee emp = new Employee();

                    System.out.print("Enter Name: ");
                    emp.setName(scanner.nextLine());

                    System.out.print("Enter Age: ");
                    emp.setAge(scanner.nextInt());

                    System.out.print("Enter Salary: ");
                    emp.setSalary(scanner.nextDouble());

                    employees.add(emp);
                    System.out.println("✅ Employee added successfully!");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        System.out.println("\n--- Employee List ---");
                        for (Employee e : employees) {
                            e.displayEmployeeInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
