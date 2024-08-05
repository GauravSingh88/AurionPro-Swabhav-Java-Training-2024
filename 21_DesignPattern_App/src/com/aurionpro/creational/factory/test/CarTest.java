package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.Mahindra;
import com.aurionpro.creational.factory.model.Maruti;
import com.aurionpro.creational.factory.model.Tata;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mahindra mahindra = new Mahindra();
		mahindra.start();
		mahindra.stop();
		
		Maruti maruti = new Maruti();
		maruti.start();
		maruti.stop();
		
		Tata tata = new Tata();
		tata.start();
		tata.stop();
		
		
		

	}

}
