package com.aurionpro.day05;

import java.util.Scanner;
import java.util.Random;

public class PigDice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int number = 0;
		int turn = 0;
		int score = 0;
		int currentScore = 0;
		String option;

		while (score < 20) {

			turn++;

			System.out.println("Turn " + turn);
			System.out.println("Score : " + currentScore);
			System.out.println();
			System.out.println("Choose Roll or Hold");

			while (currentScore < 20) {
				option = sc.next();

				if ("Roll".equalsIgnoreCase(option)) {
					number = rnd.nextInt(6) + 1;

					if (number != 1) {
						score += number;
						currentScore = score;
						System.out.println("Score : " + currentScore);
						System.out.println();
						System.out.println("Choose Roll or Hold");
					}
					if (number == 1) {
						System.out.println("Game over");
						score = 0;
						currentScore = 0;
						break;
					}

				}
				if ("Hold".equalsIgnoreCase(option)) {
					score = currentScore;
					System.out.println("Score : " + currentScore);
					System.out.println();
					System.out.println();
					break;

				}
			}

		}

		System.out.println("You finished in " + turn + " turns");

	}
	
}
