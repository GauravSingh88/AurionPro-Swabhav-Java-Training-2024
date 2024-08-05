package com.aurionpro.day05;

import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("Welcome to Number Guesser game !!!");
		System.out.println();

		int randomNumber = rnd.nextInt(100) + 1;

		System.out.println("Do you want to play the game?");

		String toPlay = sc.next();

		System.out.println();

		System.out.println("Lets start with you first guess : ");

		int guess = sc.nextInt();

		int counter = 1;
		int life = 10;

		while ("Yes".equalsIgnoreCase(toPlay) && life >= 1) {
			while (guess != randomNumber && counter <= 5) {
				
				if (guess > randomNumber) {
					System.out.println("The number you guessed is greater than actual number");
					System.out.println("Lifes left :" + --life);
				} else if (guess < randomNumber) {
					System.out.println("The number you guessed is smaller than actual number");
					System.out.println("Lifes left :" + --life);

				}

				System.out.println("You get another chance to guess : ");
				guess = sc.nextInt();

				counter++;

			}

			if (guess == randomNumber) {
				System.out.println("Congratulations your guess was correct and you took " + counter
						+ " chances to guess the number");

			} else {
				System.out.println("No lifes left");
			}

			System.out.println("Do you still want to play the game :");

			toPlay = sc.next();

			counter = 1;
			randomNumber = rnd.nextInt(100) + 1;
			life = 10;

		}

		System.out.println("Thank you for playing the game");

		System.out.println();
		sc.close();

	}

}
