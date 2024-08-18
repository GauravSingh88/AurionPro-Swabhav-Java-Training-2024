package com.aurionpro.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
//	@Value("Apple")
	private String name;
//	@Autowired
	private Harddisk harddisk;
	

	public Computer() {
		System.out.println("Inside computer");
	}
	@Autowired
	public Computer( @Value("Apple") String name, Harddisk harddisk) {
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
