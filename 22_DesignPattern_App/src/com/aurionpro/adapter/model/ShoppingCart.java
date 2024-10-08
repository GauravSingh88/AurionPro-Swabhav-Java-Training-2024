package com.aurionpro.adapter.model;

import java.util.Iterator;
import java.util.List;


public class ShoppingCart {
	
	private List<IItems> cartItems;

	public ShoppingCart(List<IItems> cartItems) {
		super();
		this.cartItems = cartItems;
	}
	
	public void addItemToCart(IItems item) {
		System.out.println(item.getItemName() + " is added to cart, item is of $" + item.getItemprice());
		cartItems.add(item);
		System.out.println("*******************");
	}
	
	public List<IItems> getCartItems() {

		return cartItems;
	}
	
	public double getCartPrice() {
		double totalPrice = cartItems.stream()
				.map((cartItems) -> cartItems.getItemprice())
				.reduce(0.0, (number1,number2)-> number1+number2);
		return totalPrice;
	}
	
	public void printCart(ShoppingCart cart) {
		System.out.println("_____________");
		 for (IItems item : cart.getCartItems()) {
	            System.out.println("Item in cart: " + item.getItemName() + " - $" + item.getItemprice());
	     }
		 System.out.println("_____________");
	}
	
	
	
	

}
