package com.aurionpro.decorator.model;

public class WheelAllign extends CarServiceDecorator {
	
	

	public WheelAllign(ICarService car) {
		super(car);
		
	}
	public double getCost() {
		// TODO Auto-generated method stub
		return 400 + super.getCost();
	}


}
