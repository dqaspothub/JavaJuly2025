package com.java.casting;

public class NarrowingExample {

	public static void main(String[] args) {
		
		float price = 99.99f;
		
		double roundedPrice = (double) price; // float to double
		
		System.out.println("Rounded price: " + roundedPrice);

	}

}
