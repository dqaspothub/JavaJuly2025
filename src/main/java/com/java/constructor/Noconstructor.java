package com.java.constructor;

public class Noconstructor {
	String title;
	String author;

	// No-arg constructor
	public Noconstructor() {
		this.title = "Untitled";
		this.author = "Anonymous";
	}

	public static void main(String[] args) {
		Noconstructor noconstructor = new Noconstructor(); // No-arg constructor called
		System.out.println(noconstructor.title); // "Untitled"
	}
}