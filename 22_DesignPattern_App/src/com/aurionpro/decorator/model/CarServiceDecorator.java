package com.aurionpro.decorator.model;

public abstract class CarServiceDecorator implements ICarService {
	
	private ICarService car;


	public CarServiceDecorator(ICarService car) {
		super();
		this.car = car;
	}


	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return car.getCost();
	}

}
