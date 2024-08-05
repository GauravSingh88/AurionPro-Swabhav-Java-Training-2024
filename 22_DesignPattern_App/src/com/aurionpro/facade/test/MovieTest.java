package com.aurionpro.facade.test;

import java.util.Scanner;

import com.aurionpro.facade.model.Movie;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Movie movieTime = new Movie();
		
		System.out.println("to start movie press 1 to stop press 2");
		int input = scanner.nextInt();
		if(input == 1) {
			movieTime.turnOn();
			
		}
		if(input == 2) {
			movieTime.turnOff();
			
		}

	}

}
