package com.aurionpro.model;
import com.aurionpro.model.*;
import com.aurionpro.test.CalculatorModel;

public class CalculatorTest {

	public static void main(String[] args) {

		int a= 20;
		int b= 10;
		
		int sum = CalculatorModel.addition(a, b);
		int sub = CalculatorModel.subtraction(a, b);
		int multi = CalculatorModel.multiplication(a, b);
		int div = CalculatorModel.division(a, b);
		
		 
		System.out.println("Addition of a & b is " +  CalculatorModel.addition(a, b));
		System.out.println("Addition of a & b is " +  CalculatorModel.subtraction(a, b));
		System.out.println("Addition of a & b is " +  CalculatorModel.multiplication(a, b));
		System.out.println("Addition of a & b is " +  CalculatorModel.division(a, b));

	}

}
