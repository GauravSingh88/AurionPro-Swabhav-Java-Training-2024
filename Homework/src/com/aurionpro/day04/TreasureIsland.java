package com.aurionpro.day04;

import java.util.Scanner;

public class TreasureIsland {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Treasure island ,Your mission is to find the treasure");

		System.out.println("You will have to make certain and series of right choices will take you to treasure");

		System.out.println("Choose your first step either Left or Right");
		String secondChoice;
		String doorChoice;

		String firstChoice = sc.nextLine();

		if ("Left".equalsIgnoreCase(firstChoice)) {
			System.out.println(
					"Congratulations you made a right choice , now its second level, either choose to Swim forward or Wait .");
			secondChoice = sc.nextLine();
			if ("Wait".equalsIgnoreCase(secondChoice)) {
				System.out.println(
						"Congratulation you again made it to the right path , now you have to choose one of the three doors - Red,Blue,Yellow");
				doorChoice = sc.nextLine();

				switch (doorChoice) {
				case "Red":
					System.out.println("Burned by fire.Game Over");
					break;
				case "Blue":
					System.out.println("Eaten by beasts.Game Over");
					break;
				case "Yellow":
					System.out.println("Congratulations!! You found the treasure.");
					break;
				default:
					System.out.println("Game Over.");
				}
			} else {
				System.out.println("Attacked by trout.Game Over");
			}
		} else {
			System.out.println("Fall into a hole.Game Over");
		}
		
		sc.close();

	}

}
