package com.aurionpro.day21.Guitar_App.model;

public enum Type {

	ACOUSTIC,ELECTRIC;
	
	public String toString() {
		switch(this) {
		case ACOUSTIC :
			return "Acoustic";
		case ELECTRIC :
			return "Electric";
		default :
			return "Unknown Types";
		}
	}
}
