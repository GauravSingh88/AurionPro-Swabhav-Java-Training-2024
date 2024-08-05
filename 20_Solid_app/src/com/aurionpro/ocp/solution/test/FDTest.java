package com.aurionpro.ocp.solution.test;

import com.aurionpro.ocp.solution.model.DiwaliInterest;
import com.aurionpro.ocp.solution.model.FixedDeposit;

public class FDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FixedDeposit fd1 = new FixedDeposit(101,"Ajay",1000,2, new DiwaliInterest());
		
		System.out.println(fd1.calculateSimpleInterest());

	}

}
