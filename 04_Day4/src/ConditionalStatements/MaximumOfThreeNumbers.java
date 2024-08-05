package ConditionalStatements;

import java.util.Scanner;


public class MaximumOfThreeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int number2 = sc.nextInt();
		
		System.out.println("Enter third number : ");
		int number3 = sc.nextInt();
		
		if(number1 > number2 && number1 > number3) {
			System.out.println(number1 + " is the maximum of three numbers");
		} else if ( number2 > number3 && number2 > number1) {
			System.out.println(number2 + " is the maximum of three numbers");
		} else {
			System.out.println(number3 + " is the maximum of three numbers");
		}
		
		
	}

}
