package com.java.constructor;

class Child extends Parent {
	
	String firstName;

	// Constructor that uses both this() and super()
	public Child() {
		// Calls another constructor in same class

		this("Aarav", "Sharma");
		System.out.println("Child no-arg constructor called");
		 	
	}

	public Child(String firstName, String lastName) {

		super(lastName);  // Calls parent constructor
		this.firstName = firstName;
		System.out.println("Child parameterized constructor called");
	}

	public void displayFullName() {

		super.bc= 10;
		System.out.println(bc);
		System.out.println("Full Name: " + firstName + " " + lastName);
	}}

