package com.java.listcollection;


import java.util.*;

public class ListToArray {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Mango");

        // Convert List to Array
        String[] fruitsArray = fruitsList.toArray(new String[0]);

        System.out.println("List: " + fruitsList);
        System.out.println("Array: " + Arrays.toString(fruitsArray));
    }
}
