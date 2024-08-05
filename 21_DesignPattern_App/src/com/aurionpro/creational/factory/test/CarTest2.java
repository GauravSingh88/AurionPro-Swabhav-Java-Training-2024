package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarBrand;
import com.aurionpro.creational.factory.model.CarFactory;

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarFactory carFactory = new CarFactory();
		
		carFactory.makeCar(CarBrand.Tata).start();

	}

}
