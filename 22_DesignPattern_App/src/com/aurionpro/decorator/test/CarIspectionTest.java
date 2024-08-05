package com.aurionpro.decorator.test;

import com.aurionpro.decorator.model.CarInspection;
import com.aurionpro.decorator.model.ICarService;
import com.aurionpro.decorator.model.OilChange;
import com.aurionpro.decorator.model.WheelAllign;

public class CarIspectionTest {
	
	public static void main(String[] args) {
		
		ICarService car = new CarInspection();
		
		double price =  car.getCost();
		System.out.println("price with only inspection :- " +  price);
		
		OilChange oil = new OilChange(car);
		price  = oil.getCost();
		System.out.println("price with inspection and oil change  :- " + price);
		
		WheelAllign wheel = new WheelAllign(car);
		price = wheel.getCost();
		System.out.println("price with inspection and wheel allignment  :- " + price);
		
		WheelAllign wheel1 = new WheelAllign(oil);
		price = wheel1.getCost();
		System.out.println("price with inspection and wheel allignment and oil change :- " + price);
		
		

		
	}

}
