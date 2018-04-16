package com.yellowpages;

public class Address {
	String street;
	String city;
	String state;
	
	public Address(String street, String city, String state) {
		this.state = state;
		this.city = city;
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String toString() {
		return street + ", " + city + ", " + state;
	}
}
