package com.aurionpro.facade.model;

public class HotelReception {
	
	public void getIndianMenu() {
		IHotel indHotel = new IndianHotel();
		IMenu menu = indHotel.getMenu();
		menu.displayMenu();
	}
	
	public void getItalianMenu() {
		IHotel italianHotel = new ItalianHotel();
		IMenu menu = italianHotel.getMenu();
		menu.displayMenu();
	}
	

}
