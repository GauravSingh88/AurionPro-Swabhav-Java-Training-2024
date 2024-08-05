package com.aurionpro.adapter.model;

public class HatAdapter implements IItems {
	
	private Hat hat;
	

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		String fullName = hat.getShortName() +  " " + hat.getLongName();
		return fullName;
	}

	@Override
	public double getItemprice() {
		// TODO Auto-generated method stub
		double price = hat.getBasicPrice() + hat.getTax();
		return price;
	}

}
