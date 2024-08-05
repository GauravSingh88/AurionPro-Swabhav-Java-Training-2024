
package com.aurionpro.abstractfactory.test;

import com.aurionpro.abstractfactory.model.ICar;
import com.aurionpro.abstractfactory.model.ICarFactory;
import com.aurionpro.abstractfactory.model.MarutiFactory;

public class CarTest {
	
	public static void main(String[] args) {
		
		ICarFactory marutiFactory = new MarutiFactory();
		
		ICar maruti = marutiFactory.makeCar();
		maruti.start();
		maruti.stop();
	}

}
