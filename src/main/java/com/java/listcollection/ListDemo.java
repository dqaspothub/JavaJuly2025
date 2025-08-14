package com.java.listcollection;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        // 1. ArrayList
        List<String> arrayList = new ArrayList<String>();

        List<Character> arrayList1 = new ArrayList<Character>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Banana");
        arrayList.add(null);// duplicates allowed
        System.out.println("ArrayList: " + arrayList);

        // 2. LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Car");
        linkedList.add("Bike");
        linkedList.add("Bus");
        System.out.println("LinkedList: " + linkedList);

        // Accessing elements using index
        System.out.println("First element in ArrayList: " + arrayList.get(0));

        // Modifying elements
        arrayList.set(1, "Mango");
        System.out.println("After modification: " + arrayList);

        // Removing elements
        arrayList.remove("Apple"); // removes first occurrence
        System.out.println("After removal: " + arrayList);

        // Checking existence
        System.out.println("Contains Mango? " + arrayList.contains("Mango"));
    }
}
