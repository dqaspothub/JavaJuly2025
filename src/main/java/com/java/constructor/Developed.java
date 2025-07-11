package com.java.constructor;
 
//Cons chainging using this


public class Developed 
{ 
// Create a default (no-argument) constructor.
   Developed() 
   { 
     System.out.println("Java was developed by James Gosling"); 
   }
// Create one parameter constructor. 
   Developed(int year) 
   { 
  // Declaration of this keyword with two parameters. It must be the first line. 
     this("Java" , 1995); // It will call two parameters constructor within the same class. 
     System.out.println("James Gosling is known as Father of Java programming language."); 
   } 
// Create two parameters constructor.
   Developed(String name, int year) 
   { 
  // Declaration of this keyword without the parameter. 
     this(); // It will call default constructor due to no parameter in this keyword. 
     System.out.println("at Sun Microsystem and released in 1995"); 
   } 
// Define an instance method. 
   void display() 
   { 
     System.out.println("The Java compiler is written in Java but Java runtime in ANSI C."); 
   } 
// Create a main method. 
   public static void main(String[] args) 
   { 
  // Create an object of class Developed using the new keyword.
  // And passes the integer argument to its one parameter constructor. 
     Developed obj = new Developed(1995); // It will call one parameter constructor. 

  // Call display method using object reference variable obj. 
     obj.display(); 
  } 
}