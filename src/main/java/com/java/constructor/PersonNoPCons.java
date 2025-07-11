package com.java.constructor;
 
public class PersonNoPCons 
 {
     // Declaration of instance variables.
   String name; 
   int age; 
   String address;
   
// Declare a non-parameterized constructor. 
   PersonNoPCons() 
   {
  // Initializing values to instance variables.
     name = "Vivek";
     age = 25;
     address = "Gandhi Nagar";
     // Print the values on the console.
     System.out.println(name+ " " +age+ " " +address);
   }

     PersonNoPCons(String name,int age,String address)
     {
         // Initializing values to instance variables.
         this.name = name;
         this.age = age;
         this.address = address;
         // Print the values on the console.
         System.out.println(name+ " " +age+ " " +address);
     }

   // Main method. 
   public static void main(String[] args) 
   {
	   // Create an object of the class. 
	   PersonNoPCons p = new PersonNoPCons(); // Calling default constructor.

       PersonNoPCons p1 = new PersonNoPCons("Grace",28,"NSK Nagar");
   } 
}