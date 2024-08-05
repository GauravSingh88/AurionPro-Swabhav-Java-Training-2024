package com.aurionpro.decorator.model;

public class OilChange extends CarServiceDecorator{
	

	public OilChange(ICarService car) {
		super(car);
	
	}
	
	public double getCost() {
		// TODO Auto-generated method stub
		return 500 + super.getCost();
	}

	
	
	

}
