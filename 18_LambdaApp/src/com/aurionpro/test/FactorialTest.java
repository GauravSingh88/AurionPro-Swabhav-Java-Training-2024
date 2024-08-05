package com.aurionpro.test;

import com.aurionpro.model.IFactorial;

public class FactorialTest {

	public static void main(String[] args) {

		IFactorial factorial = number1 -> {
			int answer = 1;
			
			for(int i = number1 ; i >=2 ; i--) {
				answer *= i;
			}
			return answer;
			
		};
		
		System.out.println(factorial.factorial(4));

	}

}
