package com.java.AccessSpecifier;

class Person {
    private String name;  // only accessible inside Person class

    public void setName(String name) {
        this.name = name;  // allowed
    }

    public String getName() {
        return name;
    }
}

public class PrivateAccessSpecifier {
    public static void main(String[] args) {
        Person p = new Person();
        //p.name = "John"; // ❌ Compilation Error
        p.setName("John"); // ✅ Works
        System.out.println(p.getName());
    }
}
