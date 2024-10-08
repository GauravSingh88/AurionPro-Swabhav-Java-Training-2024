package com.aurionpro.creational.factory.model;

public class CarFactory {
	
//	public ICar makeCar(String carName) {
//		ICar car = null;
//		
//		if(carName == "Maruti")
//			car = new Maruti();
//		
//		if(carName == "Tata")
//			car = new Maruti();
//		
//		if(carName == "Mahindra")
//			car = new Maruti();
//		
//		return car;
//		
//	}
	
	public ICar makeCar(CarBrand carName) {
		ICar car = null;
		
		if(carName == CarBrand.Maruti)
			car = new Maruti();
		
		if(carName.equals(CarBrand.Mahindra))
			car = new Mahindra();
		
		if(carName == CarBrand.Tata)
			car = new Tata();
		
		return car;
		
	}

}
