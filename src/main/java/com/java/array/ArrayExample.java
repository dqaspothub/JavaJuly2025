package com.java.array;

public class ArrayExample {

    public static void main(String[] args) {

        // Step 1: Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Step 2: Print the length of the array
        System.out.println("Length of array: " + numbers.length);

        // Step 3: Access individual elements
        System.out.println("First element: " + numbers[0]); // Index starts at 0
        System.out.println("Third element: " + numbers[2]);

        // Step 4: Modify an element
        numbers[1] = 25; // Change second element to 25
        System.out.println("Second element after update: " + numbers[1]);

        // Step 5: Loop through the array
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Step 6: Enhanced for loop (for-each)
        System.out.println("Using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}