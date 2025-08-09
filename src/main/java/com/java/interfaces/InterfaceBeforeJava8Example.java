package com.java.interfaces;

// Step 1: Define the interface
interface Animals {
    // abstract method (implicitly public and abstract)
   void makeSound();
    // constant (implicitly public static final)
   public static final int EYES = 2;


}

// Step 2: Implement the interface
class Dogs implements Animals {
    // Must override the abstract method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void sleep(){
        System.out.println("I will sleep good");
    }

}

// Step 3: Test the implementation
public class InterfaceBeforeJava8Example {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.makeSound();   // Calls overridden method
        dog.sleep();
        System.out.println("A dog has " + Animals.EYES + " eyes.");
    }
}
