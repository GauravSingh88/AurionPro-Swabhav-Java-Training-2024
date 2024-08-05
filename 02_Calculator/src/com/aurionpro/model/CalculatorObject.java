package com.aurionpro.model;

import com.aurionpro.test.CalculatorModel;

public class CalculatorObject {

	public static void main(String[] args) {
		
		CalculatorModel calc = new CalculatorModel();
		
		int a = 20;
		int b = 10;
		
		int sum = calc.addition(a, b);
		int sub = calc.subtraction(a, b);
		int mult = calc.multiplication(a, b);
		int div = calc.division(a, b);
		
		System.out.println("Addition of a & b is " +  sum);
		System.out.println("Addition of a & b is " +  sub);
		System.out.println("Addition of a & b is " +  mult);
		System.out.println("Addition of a & b is " +  div);

	}

}
