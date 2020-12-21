package com.example.addressbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class FileAccessService implements DataAccessService {

	private AddressBook book;
	private ArrayList<BaseContact> contactsList;
	public FileAccessService(AddressBook book) {
		this.book = book;
	}
	
	@Override
	public ArrayList<BaseContact> readAllContacts() throws FileNotFoundException{
		
		File file = new File("addressbook.txt");
		Scanner s = new Scanner(file);
		
		ArrayList<BaseContact> c = new ArrayList<BaseContact>();
		
		while(s.hasNextLine()) {
			
			String line = s.nextLine();
			String[] items = new String[10];
			ArrayList<Photo> photo;
			items = line.split(", ");
			int id = Integer.parseInt(items[0]);
			String name = items[1];
			int phone = Integer.parseInt(items[2]);
			photo = new ArrayList<Photo>();
			
			Location local = new Location(Integer.parseInt(items[4]), items[5], items[6], items[7]);
			BaseContact current = new BusinessContact(id, name, phone, photo, local, items[8], items[9]);
			
			c.add(current);
		}
		return c;
	}

	@Override
	public void saveAllContacts() {
		contactsList = book.contacts;
		
		try {
			File file1 = new File("addressbook.txt");
			
			FileWriter fw = new FileWriter(file1, false);
			PrintWriter pw = new PrintWriter(fw);
			
			for (BaseContact contact : book.contacts) {
				
				pw.println(contact.toString());
				
			}
			pw.close();
		}
		catch(IOException e) {
			System.out.println("Error: saveAllContacts");
		}
	}
	
	
	
	
	
}
