package com.example.addressbook;

public class Photo {

	private int id;
	private String fileName;
	private String date;
	private String description;
	
	public Photo() {
	}
	
	public Photo(int id, String fileName, String date, String description) {
		
		this.id = id;
		this.fileName = fileName;
		this.date = date;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	
	public String toString() {
		
		return "Photo [ID= " + id + ", file name= " + fileName + ", date=" + date + ", description=" + description + "]";
	}
}
