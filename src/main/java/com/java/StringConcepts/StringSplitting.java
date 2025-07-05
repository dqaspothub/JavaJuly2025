package com.java.StringConcepts;

public class StringSplitting {
    public static void main(String[] args) {
        String str = "apple,banana,orange";

        String[] fruits = str.split(",");

        System.out.println(fruits);

        System.out.println("Fruits:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        for (int i=0;i< fruits.length-1;i++){

            System.out.println(fruits[i]);
        }
    }
}


/*
Explanation:
split(regex) splits the string into an array of substrings based on the given regular expression.*/
