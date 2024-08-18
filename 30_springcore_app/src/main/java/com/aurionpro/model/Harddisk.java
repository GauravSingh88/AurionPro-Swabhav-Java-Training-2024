package com.aurionpro.model;

public class Harddisk {
	
	private int capacity;
	
	public Harddisk() {
		System.out.println("inside harddisk");
	}

	public Harddisk(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
		System.out.println("inside harddisk setter");
	}

	@Override
	public String toString() {
		return "Harddisk [capacity=" + capacity + "]";
	}
	
	

}
