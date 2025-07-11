package com.java.constructor;
 
public class Person 
{ 
 // Declaration of instance variables. 
    String name; 
    int age; 
    String address; 

 // Here, we are not creating any constructor. 
 // So, Java Compiler will automatically insert a default constructor. 
 // Create a user-defined method to print the default values. 
    void display() 
    { 
       System.out.println(name+ " " +age+ " " +address ); 
    } 
 // Static method or main method. 
    public static void main(String[] args) 
    { 
   // Create an object of class using new keyword. 
      Person p = new Person(); // Calling default constructor. 

   // Call display() method using object reference variable p. 
      p.display(); // Calling display method. 
   } 
}