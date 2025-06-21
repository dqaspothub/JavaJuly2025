package com.java.controlFlow;

public class ReturnKeywordDemo {

    public int addition(int a , int b){

        int c = a+b;

       return c;
    }

    public static void main(String[] args) {

        ReturnKeywordDemo r1 = new ReturnKeywordDemo();
       int d =  r1.addition(8,9);

        System.out.println(d);
    }
}
