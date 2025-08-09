package com.java.interfaces;

// Step 1: Define Interface
interface Animal {

    // abstract method (implicitly public and abstract)
    void makeSound();

    // default method (Java 8+)
    default void eat() {
        System.out.println("This animal eats food.");
    }

    // static method (Java 8+)
    static void sleep() {
        System.out.println("Animals need sleep.");
    }
}

// Step 2: Implement Interface in a Class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Step 3: Test Interface
public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Calls overridden method
        dog.eat();        // Calls default method
        Animal.sleep();   // Calls static method from interface
    }
}
