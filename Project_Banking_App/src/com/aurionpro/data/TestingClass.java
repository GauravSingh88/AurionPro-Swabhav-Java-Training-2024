package com.aurionpro.data;

public class TestingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerDbUtil customerDbUtil = new CustomerDbUtil();
		int balance =customerDbUtil.getCustomerBalance(378071);
		System.out.println(balance);
	}

}
