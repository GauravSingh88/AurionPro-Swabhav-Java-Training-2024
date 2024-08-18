package com.aurionpro.model;

public class Computer {
	
	private String name;
	private Harddisk harddisk;
	
	public Computer() {
		System.out.println("Inside computer");
	}
	public Computer(String name, Harddisk harddisk) {
		super();
		this.name = name;
		this.harddisk = harddisk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Harddisk getDisk() {
		return harddisk;
	}
	public void setDisk(Harddisk harddisk) {
		this.harddisk = harddisk;
		System.out.println("inside computer setter");

	}
	@Override
	public String toString() {
		return "Computer [name=" + name + ", harddisk=" + harddisk + "]";
	}
	
	

}
