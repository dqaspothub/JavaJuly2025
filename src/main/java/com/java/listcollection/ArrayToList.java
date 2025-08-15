package com.java.listcollection;


import java.util.*;

public class ArrayToList {
    public static void main(String[] args) {
        // Array
        String[] fruitsArray = {"Apple", "Banana", "Mango"};

        // Convert to List
        List<String> fruitsList = Arrays.asList(fruitsArray);

        System.out.println("Array: " + Arrays.toString(fruitsArray));
        System.out.println("List: " + fruitsList);
    }
}
