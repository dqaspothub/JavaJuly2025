package com.java.methods;


class Animal {
     final void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
//     void sound() {  //❌ Not allowed
//       System.out.println("Dog barks");
//     }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

//You want to protect a method from being modified in subclasses (e.g., Math.abs() is final).
