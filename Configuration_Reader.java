package com.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\faayeza\\eclipse-workspace\\Maven.Archetype.quickstart\\src\\main\\java\\com\\Properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
	    p = new Properties();
	    p.load(fis);
	}
	
public String geturl() {
	String url = p.getProperty("url");
	return url;
}
public String getusername() {
	String username = p.getProperty("username");
	return username;

}
public String getpassword() {
String password = p.getProperty("password");
return password;

}
}
