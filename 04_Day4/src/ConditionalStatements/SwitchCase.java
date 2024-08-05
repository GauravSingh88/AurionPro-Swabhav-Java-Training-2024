package ConditionalStatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character : ");
		char value = sc.next().charAt(0);

//		switch (value) {
//		case 'a':
//			System.out.println(value + " is a vowel");
//			break;
//		case 'e':
//			System.out.println(value + " is a vowel");
//			break;
//		case 'i':
//			System.out.println(value + " is a vowel");
//			break;
//		case 'o':
//			System.out.println(value + " is a vowel");
//			break;
//		case 'u':
//			System.out.println(value + " is a vowel");
//			break;
//		default:
//			System.out.println(value + " is not a vowel");
		
		switch (value) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(value + " is a vowel");
			break;
		default:
			System.out.println(value + " is not a vowel");
		}

	}

}
