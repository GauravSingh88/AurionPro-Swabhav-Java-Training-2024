package com.aurionpro.day22.test;

import com.aurionpro.day22.model.GoldenHat;
import com.aurionpro.day22.model.IHat;
import com.aurionpro.day22.model.PremiumHat;
import com.aurionpro.day22.model.RibbonHat;
import com.aurionpro.day22.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IHat standardHat = new StandardHat();
		IHat premiumHat = new PremiumHat();

		System.out.println("Details of standard hat");
		System.out.println("Name of hat is : " + standardHat.getName());
		System.out.println("Price of hat is : " + standardHat.getPrice());
		System.out.println("Description of hat is : " + standardHat.getDescription());

		System.out.println("*****************");

		System.out.println("Details of premium hat");
		System.out.println("Name of hat is : " + premiumHat.getName());
		System.out.println("Price of hat is : " + premiumHat.getPrice());
		System.out.println("Description of hat is : " + premiumHat.getDescription());

		System.out.println("*****************");

		System.out.println("Details of standard goldent hat");
		GoldenHat goldenStandardHat = new GoldenHat(standardHat);
		System.out.println("Name of hat is : " + goldenStandardHat.getName());
		System.out.println("Price of hat is : " + goldenStandardHat.getPrice());
		System.out.println("Description of hat is : " + goldenStandardHat.getDescription());

		System.out.println("*****************");

		System.out.println("Details of standard ribbon hat");
		RibbonHat ribbonStandardHat = new RibbonHat(premiumHat);
		System.out.println("Name of hat is : " + ribbonStandardHat.getName());
		System.out.println("Price of hat is : " + ribbonStandardHat.getPrice());
		System.out.println("Description of hat is : " + ribbonStandardHat.getDescription());

		System.out.println("*****************");

		System.out.println("Details of standard ribbon and golden hat");
		RibbonHat ribbonAndGoldenStandardHat = new RibbonHat(goldenStandardHat);
		System.out.println("Name of hat is : " + ribbonAndGoldenStandardHat.getName());
		System.out.println("Price of hat is : " + ribbonAndGoldenStandardHat.getPrice());
		System.out.println("Description of hat is : " + ribbonAndGoldenStandardHat.getDescription());

		System.out.println("*****************");

		System.out.println("Details of premium golden hat");
		GoldenHat goldenPremiumHat = new GoldenHat(premiumHat);
		System.out.println("Name of hat is : " + goldenPremiumHat.getName());
		System.out.println("Price of hat is : " + goldenPremiumHat.getPrice());
		System.out.println("Description of hat is : " + goldenPremiumHat.getDescription());

		System.out.println("*****************");

		System.out.println("Details of standard ribbon hat");
		RibbonHat ribbonPremiumHat = new RibbonHat(standardHat);
		System.out.println("Name of hat is : " + ribbonPremiumHat.getName());
		System.out.println("Price of hat is : " + ribbonPremiumHat.getPrice());
		System.out.println("Description of hat is : " + ribbonPremiumHat.getDescription());

		System.out.println("*****************");

		System.out.println("Details of premium ribbon and golden hat");
		RibbonHat ribbonAndGoldenPremiumHat = new RibbonHat(goldenPremiumHat);
		System.out.println("Name of hat is : " + ribbonAndGoldenPremiumHat.getName());
		System.out.println("Price of hat is : " + ribbonAndGoldenPremiumHat.getPrice());
		System.out.println("Description of hat is : " + ribbonAndGoldenPremiumHat.getDescription());

		System.out.println("*****************");

	}

}
