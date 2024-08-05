package com.aurionpro.behavioral.Strategy.model;

public class OperationStrategy {
	
	private IOperation operation;

	public OperationStrategy(IOperation operation) {
		super();
		this.operation = operation;
	}

	public IOperation getOperation() {
		return operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	
	
	public int doOperation(int number1,int number2) {
		return operation.doOperation(number1, number2);
	}

	
}
