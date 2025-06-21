package com.java.controlFlow;

public class EnhancedForExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        String[] names = {"kanna","Anu","Diyu", "Hari"};

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        for (String stdName : names) {
            System.out.println("StdName: " + stdName);
        }
    }
}
