package com.example.addressbook;

import java.util.ArrayList;

public class PersonContact extends BaseContact{
	
	private String dateOfBirth;
	private String description;
	private ArrayList<PersonContact> relatives;
	
	public PersonContact() {
	}
	
	public PersonContact(int number, String name, int phone, ArrayList<Photo> photos, Location location, String dob, String desc, ArrayList<PersonContact> relatives) {
		
		super(number, name, phone, photos, location);
		dateOfBirth =dob;
		description = desc;
		this.relatives = relatives;
	}

	public String getDob() {
		return dateOfBirth;
	}

	public void setDob(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<PersonContact> getRelatives() {
		return relatives;
	}

	public void setRelatives(ArrayList<PersonContact> relatives) {
		this.relatives = relatives;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ", " + dateOfBirth + ", " + description + ", " + relatives.toString();
	}
	

}

