package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_hotels {

	public WebDriver hotels;  //----->NULL
	
	@FindBy(xpath="//form[@id='select_form']//child::input[@id='radiobutton_0']")
	private WebElement radiobutton;
	
	@FindBy(xpath="//td[@align='center']//child::input[@id='continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath="//form[@id='book_hotel_form']//child::input[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//form[@id='book_hotel_form']//child::input[@id='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//form[@id='book_hotel_form']//child::textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath="//form[@id='book_hotel_form']//child::input[@id='cc_num']")
	private WebElement cardnumber;
	
	@FindBy(xpath="//form[@id='book_hotel_form']//child::select[@id='cc_type']")
	private WebElement cardname;
	
	@FindBy(xpath="//form[@id='book_hotel_form']//child::select[@id='cc_exp_month']")
	private WebElement expirymonth;
	
	@FindBy(xpath="//form[@id='book_hotel_form']//child::select[@id='cc_exp_year']")
	private WebElement expiryyear;
	
	@FindBy(xpath="//form[@id='book_hotel_form']//child::input[@id='cc_cvv']")
	private WebElement cvvnumber;
	
	@FindBy(xpath="//form[@id='book_hotel_form']//child::input[@id='book_now']")
	private WebElement booknowbutton;
	
	@FindBy(xpath="//form[@id='booking_form']//child::td[text()='Booking Confirmation ']")
	private WebElement bookingview;
	
	@FindBy(xpath="//form[@id='booking_form']//child::input[@id='my_itinerary']")
	private WebElement itinerary;
	
	@FindBy(xpath="//td[@class='welcome_menu']//child::a[text()='Logout']")
	private WebElement  lagoutbutton;
	
	
	public Booking_hotels(WebDriver hotel) {
		
		this.hotels=hotel;
		PageFactory.initElements(hotels, this);
		
	}
	public WebDriver gethotels() {
		return hotels;
	}
	public WebElement getradiobutton() {
		return radiobutton;
	}
	public WebElement getcontinuebutton() {
		return continuebutton;
	}
	public WebElement getfirstname() {
		return firstname;
	}
	public WebElement getlastname() {
		return lastname;
	}
	public WebElement getaddress() {
		return address;
	}
	public WebElement getcardnumber() {
		return cardnumber;
	}
	public WebElement getcardname() {
		return cardname;
	}
	public WebElement getexpirymonth() {
		return expirymonth;
	}
	public WebElement getexpiryyear() {
		return expiryyear;
	}
	public WebElement getcvvnumber() {
		return  cvvnumber;
	}
	public WebElement getbooknowbutton() {
		return booknowbutton;
	}
	public WebElement getbookingview() {
		return bookingview;
	}
	public WebElement getitinerary() {
		return itinerary;
	}
	public WebElement getlogoutbutton() {
		return lagoutbutton;
	}

	
}
