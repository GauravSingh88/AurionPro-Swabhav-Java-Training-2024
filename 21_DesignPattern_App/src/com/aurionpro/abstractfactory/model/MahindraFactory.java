package com.aurionpro.abstractfactory.model;

public class MahindraFactory implements ICarFactory{
	
	public ICar makeCar() {
		return new Mahindra();
	}

}
