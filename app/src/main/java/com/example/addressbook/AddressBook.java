package com.example.addressbook;

import java.util.ArrayList;

public class AddressBook {
	
	public ArrayList<BaseContact> contacts;
	
	public AddressBook() {
	}
	
	public AddressBook(ArrayList<BaseContact> contacts) {
		
		this.setContacts(contacts);
	}

	public ArrayList getContacts() {
		return contacts;
	}

	public void setContacts(ArrayList<BaseContact> contacts) {
		this.contacts = contacts;
	}
	
	public void add(BaseContact contact) {
		
		contacts.add(contact);
	}
	
	public void remove(Object contact) {
		
		contacts.remove(contact);
	}
	
	public void display(Object contact) {
		
		System.out.println(contact.toString());
	}
	
	public void sort() {
	}
	
	public BaseContact Search(int number) {
		
		for (BaseContact contact : contacts) {
			
			if (contact.getNumber() == number) {
				
				return contact;
			}
		}
		return null;
	}
	
public BaseContact Search(String name) {
		
		for (BaseContact contact : contacts) {
			
			if (contact.getName() == name) {
				
				return contact;
			}
		}
		return null;
	}
	
	public PersonContact Search(ArrayList<PersonContact> relatives) {
	
		for( BaseContact contact : contacts) {
			
			PersonContact temp = (PersonContact)contact;
			if (temp.getRelatives() == relatives) {
				
				return temp;
			}
		}
		return null;
	}
	
	public PersonContact Search(Location location) {
		
		for( BaseContact contact : contacts) {
			
			PersonContact temp = (PersonContact)contact;
			if (temp.getLocation() == location) {
				
				return temp;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		
		return "Addressbook Contacts" + contacts;
	}
	

}
