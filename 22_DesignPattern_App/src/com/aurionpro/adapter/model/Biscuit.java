package com.aurionpro.adapter.model;

public class Biscuit implements IItems {
	
	private String name;
	private double mrp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	public Biscuit(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public double getItemprice() {
		// TODO Auto-generated method stub
		return mrp;
	}
	
	

}
