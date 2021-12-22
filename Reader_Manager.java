package com.helper;

import com.Properties.Configuration_Reader;

public class Reader_Manager {
	
	private Reader_Manager() {
		
	}
public static Reader_Manager getInstanceRM() {
Reader_Manager rm = new Reader_Manager();
return rm;
}
public Configuration_Reader getInstanceCR() throws Throwable {
		
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}
}
