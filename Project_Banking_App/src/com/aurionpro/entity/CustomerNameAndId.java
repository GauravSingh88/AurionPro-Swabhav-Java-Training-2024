package com.aurionpro.entity;

public class CustomerNameAndId {
	
	private int customerId;
	private String firstName;
	private String lastName;
	public CustomerNameAndId(int customerId, String firstName, String lastName) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "CustomerNameAndId [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	
	

}
