package com.aurionpro.abstractfactory.model;

public class TataFactory implements ICarFactory {
	
	public ICar makeCar() {
		return new Tata();
	}

}
