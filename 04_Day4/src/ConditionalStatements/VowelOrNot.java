package ConditionalStatements;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character : ");
		char value = sc.next().charAt(0);
		
		if ( value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u') {
			System.out.println(value + " is a vowel");
		} else {
			System.out.println(value + " is not a vowel");
		}
		
		

	}

}
