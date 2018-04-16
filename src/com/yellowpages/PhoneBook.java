package com.yellowpages;

public class PhoneBook {
	String id;
	String phone;
	
	protected PhoneBook(){
		
	}
	
	public PhoneBook(String id, String phone) {
		this.phone = phone;
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}	
	public String toString() {
		return id + phone;
	}
}
