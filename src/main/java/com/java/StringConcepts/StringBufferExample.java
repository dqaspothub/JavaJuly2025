package com.java.StringConcepts;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println(sb); // Hello World

        sb.insert(6, "Java ");
        System.out.println(sb); // Hello Java World

        sb.replace(6, 10, "Amazing");
        System.out.println(sb); // Hello Amazing World

        sb.delete(5, 12);
        System.out.println(sb); // HelloWorld

        sb.reverse();
        System.out.println(sb); // dlroWolleH
    }
}
