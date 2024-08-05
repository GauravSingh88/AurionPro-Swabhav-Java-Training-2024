package com.aurionpro.behavioral.Strategy.test;

import com.aurionpro.behavioral.Strategy.model.AddOperation;
import com.aurionpro.behavioral.Strategy.model.MultiplyOperation;
import com.aurionpro.behavioral.Strategy.model.OperationStrategy;

public class OperationTest {
	
	public static void main(String[] args) {
		
		
		
		OperationStrategy op = new OperationStrategy(new AddOperation());
	
		System.out.println(op.doOperation(5, 7));
		
		op.setOperation(new MultiplyOperation());
	
		System.out.println(op.doOperation(5, 7));
		
	}

}
