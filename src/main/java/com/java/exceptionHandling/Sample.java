package com.java.exceptionHandling;

import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            System.out.println(a);
        } catch (Exception e){
e.printStackTrace();
        }
    }
}
