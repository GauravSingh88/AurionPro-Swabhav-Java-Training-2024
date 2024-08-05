package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.CricketPlayer;;

public class CricketPlayerTest {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int average =0;
		System.out.println("Enter the number of cricket players");
		int playerNumbers = sc.nextInt();
		CricketPlayer players[] =  new CricketPlayer[playerNumbers];
		
		for(int i = 0; i< players.length ; i++) {
			System.out.println("Enter player id : ");
			int playerId =  sc.nextInt();
			
			System.out.println("Enter player name : ");
			String name = sc.next();
			
			System.out.println("Enter number of matches player has played  :"); 
			int numberOfMatches = sc.nextInt();
			
			System.out.println("Enter runs: ");
			int runs = sc.nextInt();
			
			System.out.println("Enter wickets : ");
			int wickets = sc.nextInt();
			
			players[i]= new CricketPlayer(playerId, name, numberOfMatches, runs,wickets );
			
			
		}
		
		for(int i = 0; i< players.length ; i++) {
			players[i].display();
			System.out.println("average : " + players[i].calculateAverage());
			System.out.println();
		}

	}

}
