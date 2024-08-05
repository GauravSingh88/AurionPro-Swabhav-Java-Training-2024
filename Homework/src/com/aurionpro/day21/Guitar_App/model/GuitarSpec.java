package com.aurionpro.day21.Guitar_App.model;

public class GuitarSpec {

	private Builder builder;
	private String model;
	private Type type;
	private Wood topWood;
	private Wood backWood;
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood topWood, Wood backWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.topWood = topWood;
		this.backWood = backWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	
	public int getNumStrings() {
		return numStrings;
	}

	public boolean matches(GuitarSpec otherSpec) {
		// TODO Auto-generated method stub
		if(builder != otherSpec.builder)
			return false;
		if((model != null) && (!model.equals("")) &&(!model.equals(otherSpec.model)))
			return false;
		if(type != otherSpec.type)
			return false;
		if(numStrings != otherSpec.numStrings)
			return false;
		if(backWood != otherSpec.backWood)
			return false;
		if(topWood != otherSpec.topWood)
			return false;
		return true;
	}

}
