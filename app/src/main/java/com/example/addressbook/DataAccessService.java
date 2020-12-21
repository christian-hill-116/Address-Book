package com.example.addressbook;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface DataAccessService {
	
	public ArrayList<BaseContact> readAllContacts() throws FileNotFoundException;
	public void saveAllContacts();
	
}
