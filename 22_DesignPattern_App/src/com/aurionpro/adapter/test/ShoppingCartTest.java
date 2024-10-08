package com.aurionpro.adapter.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.adapter.model.Biscuit;
import com.aurionpro.adapter.model.Hat;
import com.aurionpro.adapter.model.HatAdapter;
import com.aurionpro.adapter.model.IItems;
import com.aurionpro.adapter.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hat hat = new Hat("short","long",900,10);
		HatAdapter hat1 = new HatAdapter(hat);
		Biscuit biscuit = new Biscuit("biscuit1",200);
		
		List<IItems> cartItems = new ArrayList<>();
		
		ShoppingCart cart = new ShoppingCart(cartItems);
		
		
		cart.addItemToCart(biscuit);
		

		cart.addItemToCart(hat1);

		
		cart.printCart(cart);
		
		System.out.println("total cart price is : $" + cart.getCartPrice());
		

	}

}
