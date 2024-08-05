package com.aurionpro.test;

public class Test {

	public static void main(String[] args) {
		try {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
			double result = number1/number2;
			
			System.out.println(result);
		} catch(ArithmeticException exception) {
			System.out.println("Input should not be 0");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Index out of Bound");
		}
		catch(NumberFormatException exception) {
			System.out.println("only integers allowed");
		}
		catch(Exception exception){
			System.out.println("Something went wrong" + exception);
		}
		finally {
			System.out.println("Closing all activities");
		}
		
		
		
		System.out.println("Exiting main");


	}

}
