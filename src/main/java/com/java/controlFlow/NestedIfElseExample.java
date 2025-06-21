package com.java.controlFlow;

import java.util.Scanner;

public class NestedIfElseExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (yes/no): ");
        String studentStatus = scanner.next().toLowerCase();

        // Outer if-else for age check
        if (age >= 18) {
            // First nested if-else for student status
            if (studentStatus.equals("yes")) {
                System.out.println("You're an adult student. You get a 20% discount!");
            } else {
                System.out.println("You're an adult non-student. Regular pricing applies.");
            }
        } else {
            // First nested if-else for minors
            if (age >= 13) {
                // Second nested if-else for teen students
                if (studentStatus.equals("yes")) {
                    System.out.println("You're a teenage student. You get a 30% discount!");
                } else {
                    System.out.println("You're a teenage non-student. You get a 10% discount!");
                }
            } else {
                System.out.println("You're a child. You get free entry!");
            }
        }

        scanner.close();
    }
}