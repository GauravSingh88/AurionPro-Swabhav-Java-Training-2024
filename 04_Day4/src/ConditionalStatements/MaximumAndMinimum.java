package ConditionalStatements;

import java.util.Scanner;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int number2 = sc.nextInt();
		
		if(number1 == number2) {
			System.out.println("Both numbers are equal");
		} else if(number1 > number2){
			System.out.println("Maximum number is : " + number1 + " minimum number is" + number2);
		} else if (number2 > number1) {
			System.out.println("Maximum number is : " + number2 + " minimum number is" + number1);
		}

	}

}
