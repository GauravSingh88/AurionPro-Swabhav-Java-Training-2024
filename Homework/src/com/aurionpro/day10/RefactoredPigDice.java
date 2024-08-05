package com.aurionpro.day10;

import java.util.Scanner;
import java.util.Random;

class GameState {
	int score = 0;
	int currentScore = 0;
	int turn = 0;
}

public class RefactoredPigDice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int number = 0;
		String option = null;
		GameState gameState = new GameState();

		theGame(gameState, option, number, scanner, random);
		System.out.println("You finished in " + gameState.turn + " turns");

	}

	private static void holdOption(String option, GameState gameState) {
		if ("Hold".equalsIgnoreCase(option)) {
			gameState.score = gameState.currentScore;
			System.out.println("Score : " + gameState.currentScore);
			System.out.println();
			System.out.println();
			gameState.turn++;
			System.out.println("Turn : " + gameState.turn);

		}
	}

	private static void gameOver(int number, GameState gameState) {
		if (number == 1) {
			System.out.println("Game over");
			gameState.score = 0;
			gameState.currentScore = 0;
			gameState.turn++;
			System.out.println("Turn : " + gameState.turn);

		}
	}

	private static void scoreAdd(int number, GameState gameState) {
		if (number != 1) {
			System.out.println("Dice : " + number);
			gameState.score += number;
			gameState.currentScore = gameState.score;
			System.out.println("Score : " + gameState.currentScore);
			System.out.println();
			System.out.println("Choose Roll or Hold");
		}
	}

	private static void rollOption(String option, int number, GameState gameState, Random random) {
		if ("Roll".equalsIgnoreCase(option)) {
			number = random.nextInt(6) + 1;

			scoreAdd(number, gameState);
			gameOver(number, gameState);

		}
	}

	private static void printOption(GameState gameState) {
		System.out.println("Turn " + gameState.turn);
		System.out.println("Score : " + gameState.currentScore);
		System.out.println();
		System.out.println("Choose Roll or Hold");
	}

	private static void optionChecker(String option, int number, GameState gameState, Scanner scanner, Random random) {
		while (gameState.currentScore < 20) {
			option = scanner.next();
			rollOption(option, number, gameState, random);
			holdOption(option, gameState);
		}
	}

	private static void theGame(GameState gameState, String option, int number, Scanner scanner, Random random) {
		while (gameState.score < 20) {

			gameState.turn++;
			printOption(gameState);
			optionChecker(option, number, gameState, scanner, random);

		}
	}
}