package com.aurionpro.test;

public class ReverseArray {

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 4, 5, 5, 5, 6}; 
		
		int[] reversedArray = new int[array.length];
		
		for(int i =0 ; i< array.length ; i ++) {
			reversedArray[array.length  -1 - i] = array [i];
		}
		
		for(int i =0 ; i< array.length ; i ++) {
			System.out.print(reversedArray[i]);
		}

	}

}
