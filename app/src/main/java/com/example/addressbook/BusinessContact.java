package com.example.addressbook;

import java.util.ArrayList;

public class BusinessContact extends BaseContact{
	
	private String operatingHours;
	private String url;
	
	public BusinessContact() {
	}
	
	

	public BusinessContact(int number, String name, int phone, ArrayList<Photo> photos, Location location, String operatingHours, String url) {
		
		super(number, name, phone, photos, location);
		this.setOperatingHours(operatingHours);
		this.setUrl(url);
	}



	public String getOperatingHours() {
		return operatingHours;
	}



	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ", " + operatingHours + ", " + url  + ", ";
	}
	

}
