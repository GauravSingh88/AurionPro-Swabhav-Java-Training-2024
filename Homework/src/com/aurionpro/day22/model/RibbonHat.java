package com.aurionpro.day22.model;

public class RibbonHat extends HatDecorator{
	
	private IHat hat;

	public RibbonHat(IHat hat) {
		super(hat);
		this.hat = hat;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName() + " Ribbon hat";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 800;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription()+ " and a ribbon hat";
	}

}
