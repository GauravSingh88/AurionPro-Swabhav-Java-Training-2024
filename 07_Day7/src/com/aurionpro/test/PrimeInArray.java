package com.aurionpro.test;

public class PrimeInArray {
	
	public static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 4, 5, 5, 5, 6}; 
		int[] evenArray = new int[array.length];
		
		int count =0;
		
		for(int i =0 ; i< array.length ; i ++) {
			
			
			
			for(int j =0 ; j< array.length ; j ++) {
				if(isPrime(array[i])) {
					if(array[i] != evenArray[0]) {
						count++;
						System.out.println(array[i] + " is prime element of array");
						evenArray[0] = array [i];
						
					}
				}
				
			}
			
			
		}
		
		System.out.println("total " + count + " prime elements are there");

	}

}
