package com.projectobjectmodel;

import org.openqa.selenium.WebDriver;

import com.pom.Booking_hotels;
import com.pom.Booking_rooms;
import com.pom.Log_in_page;

public class Page_object_manger {
	
	public WebDriver driver;  

	 private Log_in_page log;  //----->NULL
	 
	 private Booking_rooms rooms;  //---->NULL
	 
	 private Booking_hotels hotels;  //----->NULL
	 
	
	public Page_object_manger(WebDriver driver2) {

	    driver = driver2;
	}
	public Log_in_page getlog() {
		 log =new Log_in_page(driver);
		 
		 return log;
	 }
	 public Booking_rooms getroom() {
		 rooms =new Booking_rooms(driver);
		 
		 return rooms;
	 }
	 public Booking_hotels gethotels() {
		 hotels =new Booking_hotels(driver);
		 
		 return hotels;
	 }
	 
	
}
