package com.collectData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Import_Data {
	
	public static Properties p;  //---->NULL
	
	public  Import_Data() throws IOException {
   
		File f=new File("C:\\Users\\hi\\eclipse-workspace\\Maven_Demo\\src\\main\\java\\com\\properties\\Data.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
	    p=new Properties();//---->NULL
		
		p.load(fis);
		
	}
	
	public String getusername() throws IOException {
		
		String name = p.getProperty("username");
		
		return name;
		
	}
	
	public String getpassword () throws IOException {
		
		String pass = p.getProperty("password");
		
		return pass;
		
	}
	

}
