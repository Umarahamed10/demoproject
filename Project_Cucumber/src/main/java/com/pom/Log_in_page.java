package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_in_page {
	
	public  WebDriver drive;   //----->NULL
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@name='login']")
	private WebElement login;
	
	
	public  Log_in_page(WebDriver drive) {
		
		this.drive=drive;
		PageFactory.initElements(drive, this);
		
	}
	public WebDriver getdrive() {
		return drive;
		
	}
	public WebElement getusername() {
		return username;
		
	}
	public WebElement getpassword() {
		return password;
		
	}
	public WebElement getlogin() {
		return login;
	}

}
