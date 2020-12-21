package com.example.addressbook;

public class Location {
	
	private int id;
	private String street;
	private String city;
	private String state;
	
	public Location() {
	}
	
	public Location(int id, String street, String city, String state) {
		
		this.setId(id);
		this.setStreet(street);
		this.setCity(city);
		this.setState(state);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		
		return id + ", " + street + ", " + city + ", " + state;
	}

}
