package com.java.iterator;


import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("John", "Mary", "Steve"));

        ListIterator<String> listIt = names.listIterator();

        System.out.println("Forward iteration:");
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        System.out.println("Backward iteration:");
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }
        // Get Iterator
        Iterator<String> n = names.iterator();

        System.out.println("Iterating using Iterator:");
        while (n.hasNext()) {
            String username = n.next();
            System.out.println(username);
        }
    }
    }
