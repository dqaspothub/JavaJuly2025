package com.java.controlFlow;

public class DoWhileLoopExample {

	public static void main(String[] args) {

		int tries = 1;

		boolean wantToPlayAgain = false;

		do {
		    System.out.println("Playing the game. Try #" + tries);
		    tries++;
		} while (wantToPlayAgain);


	}
}

/*

int chocolates = 5;

while (chocolates > 0) {
		System.out.println("Rahul eats a chocolate 🍫");
chocolates--;
		}
*/
