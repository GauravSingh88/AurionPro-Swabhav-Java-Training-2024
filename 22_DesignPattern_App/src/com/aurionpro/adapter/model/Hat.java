package com.aurionpro.adapter.model;

public class Hat {

	private String shortName;
	private String LongName;
	private double basicPrice;
	private double tax;
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getLongName() {
		return LongName;
	}
	public void setLongName(String longName) {
		LongName = longName;
	}
	public double getBasicPrice() {
		return basicPrice;
	}
	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public Hat(String shortName, String longName, double basicPrice, double tax) {
		super();
		this.shortName = shortName;
		LongName = longName;
		this.basicPrice = basicPrice;
		this.tax = tax;
	}
	
	
}
