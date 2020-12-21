package com.example.addressbook;

import java.util.ArrayList;

public abstract class BaseContact {
	
	private int number;
	private String name;
	private int phone;
	private ArrayList<Photo> photos;
	private Location location;
	
	public BaseContact() {
		
	}
	
	public BaseContact(int number, String name, int phone, ArrayList<Photo> photos, Location location) {
		
		this.number = number;
		this.name = name;
		this.phone = phone;
		this.photos = photos;
		this.location = location;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public ArrayList<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(ArrayList<Photo> photos) {
		this.photos = photos;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "" + number + ", " + name + ", " + phone + ", " + photos.toString() + ", " + location.toString() + ", "; 
	}
}
