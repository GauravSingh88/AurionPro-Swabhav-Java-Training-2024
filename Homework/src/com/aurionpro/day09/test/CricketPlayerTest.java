package com.aurionpro.day09.test;

import java.util.Scanner;

import com.aurionpro.day09.model.CricketPlayer;;

public class CricketPlayerTest {
	
	public static CricketPlayer maximumAveragePlayer(CricketPlayer[] players) {
		CricketPlayer maxAveragePlayer = players[0];
		double maxAverage = maxAveragePlayer.calculateAverage();
		for(int i = 1 ; i< players.length ; i++) {
			if(maxAverage < players[i].calculateAverage()) {
				maxAverage =  players[i].calculateAverage();
				maxAveragePlayer = players[i];
			}
		}
		
		return maxAveragePlayer;
	}
	
public static void sortPlayersAscending(CricketPlayer[] players) {
        
        int n = players.length;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (players[i - 1].calculateAverage() > players[i].calculateAverage()) {
                    
                    CricketPlayer temp = players[i - 1];
                    players[i - 1] = players[i];
                    players[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

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
		
		CricketPlayer maxAveragePlayer =  maximumAveragePlayer(players);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Details of maximum average player : ");
		
		maxAveragePlayer.display();
		System.out.println("average : " + maxAveragePlayer.calculateAverage());

//		System.out.println("Player id : " + maxAveragePlayer.getPlayerId());
//		System.out.println("Name : " + maxAveragePlayer.getName());
//		System.out.println("Runs : " + maxAveragePlayer.getRuns());
//		System.out.println("Number of matches : " + maxAveragePlayer.getNumberOfMatches());
//		System.out.println("Wickets : " + maxAveragePlayer.getWickets());
//		System.out.println("Average : " + maxAveragePlayer.calculateAverage());
		
		System.out.println();
		System.out.println();
		
		sortPlayersAscending(players);

	      
        for (CricketPlayer player : players) {
//        	System.out.println("Player id : " + player.getPlayerId());
//    		System.out.println("Name : " + player.getName());
//    		System.out.println("Runs : " + player.getRuns());
//    		System.out.println("Number of matches : " + player.getNumberOfMatches());
//    		System.out.println("Wickets : " + player.getWickets());
        	player.display();
    		System.out.println("Average : " + player.calculateAverage());
        }

	}

}
