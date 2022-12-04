package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_rooms {

	public  WebDriver rooms;   //----->NULL
	
	@FindBy(xpath="//form[@id='search_form']//child::select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//form[@id='search_form']//child::select[@id='hotels']")
	private WebElement hotelType;
	 
	@FindBy(xpath="//form[@id='search_form']//child::select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//form[@id='search_form']//child::select[@id='room_nos']")
	private WebElement roomNos;
	
	@FindBy(xpath="//form[@id='search_form']//child::select[@id='adult_room']")
    private WebElement adultRoom;
	
	@FindBy(xpath="//form[@id='search_form']//child::select[@id='child_room']")
	private WebElement childRoom;
	
	@FindBy(xpath="//form[@id='search_form']//child::input[@id='Submit']")
	private WebElement submit;
	
	public Booking_rooms(WebDriver room) {
	
		this.rooms=room;
		PageFactory.initElements(rooms, this);
		
	}
	public WebDriver getroom() {
		return rooms;
	}
	public WebElement getlocation() {
		return location;
	}
	public WebElement gethotelType() {
		return hotelType;
	}
	public WebElement getroomType() {
		return roomType;
	}
	public WebElement getroomNos() {
		return roomNos;
	}
	public WebElement getadultRoom() {
		return adultRoom;
	}
	public WebElement getchildRoom() {
		return childRoom;
	}
	public WebElement getsubmit() {
		return submit;
	}
	
}
