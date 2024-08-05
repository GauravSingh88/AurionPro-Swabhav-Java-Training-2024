package com.aurionpro.day21.Guitar_App.model;

public enum Wood {
	
	INDIAN_ROSEWOOD,BRAZILIAN_ROSEWOOD,MAHOGANY,MAPLE ,CEDAR,COCOBOLO,ADIRONDACK,ALDER,SITKA;
	
	public String toString() {
		switch(this) {
		case INDIAN_ROSEWOOD:
			return "Indian Rosewood";
		case BRAZILIAN_ROSEWOOD:
			return "Brazilian Rosewood";
		case MAHOGANY:
			return "Mahogany";
		case MAPLE:
			return "Maple";
		case CEDAR:
			return "Cedar";
		case COCOBOLO:
			return "Cocobolo";
		case ADIRONDACK:
			return "Adirondack";
		case ALDER:
			return "Alder";
		case SITKA:
			return "Sitka";
		default :
			return "Unknown Wood";
		
		}
	}

}
