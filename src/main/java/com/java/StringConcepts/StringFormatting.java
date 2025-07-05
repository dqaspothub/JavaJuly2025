package com.java.StringConcepts;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;

        // Using String.format()
        String formattedString = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println(formattedString);

        // Using f-strings (Java 15+)
        String formattedString2 = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println(formattedString2);
    }
}

/*
Explanation:
        String.format() allows you to create formatted strings using placeholders like %s (for strings) and %d (for integers).
Java 15 introduced text blocks and f-strings for more concise formatting.
*/
