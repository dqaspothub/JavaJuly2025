package com.java.UserInputs;


import java.util.Scanner;

    public class ScannerExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine(); // reads full line with spaces

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.print("Enter your GPA: ");
            double gpa = scanner.nextDouble();

            System.out.println("\nHello, " + name + "!");
            System.out.println("You are " + age + " years old.");
            System.out.println("Your GPA is " + gpa);

            scanner.close(); // Good practice
        }
    }