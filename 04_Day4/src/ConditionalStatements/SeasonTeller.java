package ConditionalStatements;

import java.util.Scanner;

public class SeasonTeller {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a month number: ");
		int monthNumber =sc.nextInt();
		
		switch(monthNumber) {
		case 1:
		case 10:
		case 11:
		case 12:
			System.out.println("Its winter season");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Its summer season");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Its monsoon season");
			break;
		}

	}

}
