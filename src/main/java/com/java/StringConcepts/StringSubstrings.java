package com.java.StringConcepts;

public class StringSubstrings {
    public static void main(String[] args) {
        String str = "Java Programming";
        String sub1 = str.substring(0, 4); // "Java" (from index 0 up to, but not including, 4)
        String sub2 = str.substring(5);   // "Programming" (from index 5 to the end)
        String sub3 = str.substring(5, 14); // "Programmin"

        System.out.println("Substring 1: " + sub1);
        System.out.println("Substring 2: " + sub2);
        System.out.println("Substring 3: " + sub3);
    }
}

/*
Explanation:
substring(beginIndex, endIndex) extracts a portion of the string. endIndex is exclusive.
substring(beginIndex) extracts from beginIndex to the end of the string.*/
