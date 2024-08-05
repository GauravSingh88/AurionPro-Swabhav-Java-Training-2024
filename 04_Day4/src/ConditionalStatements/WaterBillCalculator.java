package ConditionalStatements;

import java.util.Scanner;

public class WaterBillCalculator {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter units Consumed : ");
		
		int unitsConsumed = sc.nextInt();
		int meterCharge =  75;
		int charge;
		
		if( unitsConsumed <=100) {
			charge = unitsConsumed * 5;
		} else {
			if(unitsConsumed <= 250 ) {
				charge = unitsConsumed * 10;
			} else {
				charge = unitsConsumed * 20 ;
			}
		}
		
		
		int totalWaterBill = charge + meterCharge;
		
		System.out.println("water bill of units : " + unitsConsumed + " is : " + totalWaterBill);

	}

}
