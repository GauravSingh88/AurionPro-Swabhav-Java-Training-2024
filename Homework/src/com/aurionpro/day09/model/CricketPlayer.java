package com.aurionpro.day09.model;

public class CricketPlayer {
	
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	
	public CricketPlayer() {
		
	}
	
	public CricketPlayer(int playerId,String name,int numberOfMatches,int runs,int wickets) {
		this.playerId = playerId;
		this.name = name;
		this.numberOfMatches = numberOfMatches;
		this.runs =runs;
		this.wickets =wickets;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	public void display() {
		System.out.println("Player id : " + this.playerId);
		System.out.println("Name : " + this.name);
		System.out.println("Number of Matches : " + this.numberOfMatches);
		System.out.println("Runs : " + this.runs);
		System.out.println("Wickets : " + this.wickets);
	}
	
	public double calculateAverage() {
		double average = this.runs / this.numberOfMatches;
		return average;
	}
	

	
	

}
