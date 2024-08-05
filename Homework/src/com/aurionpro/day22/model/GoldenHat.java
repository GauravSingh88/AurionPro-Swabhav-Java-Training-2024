package com.aurionpro.day22.model;

public class GoldenHat extends HatDecorator {

	private IHat hat;

	public GoldenHat(IHat hat) {
		super(hat);
		this.hat = hat;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName() + " Golden hat";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 1000;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + " and a golden hat";
	}
	
	
}
