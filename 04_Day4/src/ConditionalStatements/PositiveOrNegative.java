package ConditionalStatements;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int number1 = sc.nextInt();
		
		if (number1 == 0) {
			System.out.println("Number is neither positive nor negative");
		} else if (number1 > 0) {
			System.out.println("Number is positive ");
		} else if(number1 < 0) {
			System.out.println("Number is negative ");
		}

	}

}
