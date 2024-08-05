package com.aurionpro.test;

public class EvenInArray {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 4, 5, 5, 5, 6}; 
		int[] evenArray = new int[array.length];
		
		int count =0;
		
		for(int i =0 ; i< array.length ; i ++) {
			
			for(int j =0 ; j< array.length ; j ++) {
				if(array[i] %2 == 0) {
					if(array[i] != evenArray[0]) {
						count++;
						System.out.println(array[i] + " is even element of array");
						evenArray[0] = array [i];
						
					}
				}
				
			}
			
			
		}
		
		System.out.println("total " + count + " even elements are there");

	}

}
