package com.aurionpro.day21.Guitar_App.test;

import java.util.Iterator;
import java.util.List;

import com.aurionpro.day21.Guitar_App.model.Builder;
import com.aurionpro.day21.Guitar_App.model.Guitar;
import com.aurionpro.day21.Guitar_App.model.GuitarSpec;
import com.aurionpro.day21.Guitar_App.model.Inventory;
import com.aurionpro.day21.Guitar_App.model.Type;
import com.aurionpro.day21.Guitar_App.model.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		GuitarSpec whatErenLikes = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC,6, Wood.ALDER, Wood.ALDER);		
		List matchingGuitars = inventory.search(whatErenLikes);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Eren you might like these guitars");
			for(Iterator i = matchingGuitars.iterator();i.hasNext();) {
				Guitar guitar= (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("We have a " +
						spec.getBuilder() + " " + spec.getModel() + " " +
						spec.getNumStrings() + "-Strings " +
						spec.getType() + " guitar:\n " +
						spec.getBackWood() + " top.\n You can have it for only $" + guitar.getPrice() + " \n ----");
			}
		} else {
			System.out.println("Sorry , Eren, we have nothing for you.");
		}

	}

	private static void initializeInventory(Inventory inventory) {
		// add guitars to inventory
		GuitarSpec fenderStrat = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC,6, Wood.ALDER, Wood.ALDER);
	    GuitarSpec gibsonLesPaul = new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC,6, Wood.MAPLE, Wood.MAHOGANY);

	    // Add guitars to inventory
	    inventory.addGuitar("V95693", 1499.95, fenderStrat);
	    inventory.addGuitar("V95123", 1549.95, fenderStrat);
	    inventory.addGuitar("G12345", 599.95, gibsonLesPaul);
		
	}
	
	

}
