package com.java.iterator;


import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Get Iterator
        Iterator<String> it = fruits.iterator();

        System.out.println("Iterating using Iterator:");
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);

            // Example: remove "Banana" safely
            if (fruit.equals("Banana")) {
                it.remove();  // Safe removal
            }
        }

        System.out.println("List after removal: " + fruits);
    }
}
