package ConditionalStatements;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter first number : ");
			int number1 = sc.nextInt();
			
			if (number1 % 2== 0) {
				System.out.println(number1 + " is an even number");
			} else {
				System.out.println(number1 + " is a odd number");
			}

	}

}
