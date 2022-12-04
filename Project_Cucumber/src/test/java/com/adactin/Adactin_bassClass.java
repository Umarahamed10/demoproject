package com.adactin;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactin_bassClass extends Adactin_Utility_files  {
   
	public static WebDriver driver;    //------>NULL
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		driver =browser_lanch("chrome");
		
		get_url("http://adactinhotelapp.com/index.php");
		
		window_maximize("fullscreen");
		
		WebElement r = driver.findElement(By.xpath("//form[@id='login_form']//child::input[@id='username']"));
		send_keys(r, "Umarahamed1010");
		
		WebElement user = driver.findElement(By.xpath("//form[@id='login_form']//child::input[@id='password']"));
		send_keys(user, "umar101010");
	
		
		WebElement login = driver.findElement(By.xpath("//form[@id='login_form']//child::input[@id='login']"));
		click_on(login);
		
		WebElement location = driver.findElement(By.xpath("//form[@id='search_form']//child::select[@id='location']"));
		select_by_index(location, 8);
		
		WebElement hotels = driver.findElement(By.xpath("//form[@id='search_form']//child::select[@id='hotels']"));
		select_by_index(hotels, 2);
		
		WebElement roomtype = driver.findElement(By.xpath("//form[@id='search_form']//child::select[@id='room_type']"));
		select_by_index(roomtype, 3);
		
		WebElement roomnos = driver.findElement(By.xpath("//form[@id='search_form']//child::select[@id='room_nos']"));
		select_by_index(roomnos, 3);
		
		WebElement adultroom = driver.findElement(By.xpath("//form[@id='search_form']//child::select[@id='adult_room']"));
		select_by_index(adultroom, 2);
		
		WebElement childroom = driver.findElement(By.xpath("//form[@id='search_form']//child::select[@id='child_room']"));
	    select_by_index(childroom, 1);
		
		WebElement search = driver.findElement(By.xpath("//form[@id='search_form']//child::input[@id='Submit']"));
		click_on(search);
		
		WebElement radio = driver.findElement(By.xpath("//form[@id='select_form']//child::input[@id='radiobutton_0']"));
		implicitly_Wait(10);
		click_on(radio);
		
		WebElement continus = driver.findElement(By.xpath("//td[@align='center']//child::input[@id='continue']"));
		click_on(continus);
		
		WebElement firstname = driver.findElement(By.xpath("//form[@id='book_hotel_form']//child::input[@id='first_name']"));
		send_keys(firstname, "Ahamed");
		
		WebElement lastname = driver.findElement(By.xpath("//form[@id='book_hotel_form']//child::input[@id='last_name']"));
		send_keys(lastname, "Umar");
		
		WebElement address = driver.findElement(By.xpath("//form[@id='book_hotel_form']//child::textarea[@id='address']"));
		send_keys(address, "Paris Kuruku_santhu");
		
		WebElement cardnumber = driver.findElement(By.xpath("//form[@id='book_hotel_form']//child::input[@id='cc_num']"));
		send_keys(cardnumber, "9876543212346789");
		
		Sleep(2000);
		
		WebElement cardname = driver.findElement(By.xpath("//form[@id='book_hotel_form']//child::select[@id='cc_type']"));
		select_by_index(cardname, 2);
		
		WebElement expirymonth = driver.findElement(By.xpath("//form[@id='book_hotel_form']//child::select[@id='cc_exp_month']"));
		select_by_index(expirymonth, 12);
		
		WebElement expiryyear = driver.findElement(By.xpath("//form[@id='book_hotel_form']//child::select[@id='cc_exp_year']"));
		select_by_index(expiryyear, 12);
		
		Sleep(2000);
		WebElement cvvno = driver.findElement(By.xpath("//form[@id='book_hotel_form']//child::input[@id='cc_cvv']"));
		send_keys(cvvno, "212");
		
		WebElement booknow = driver.findElement(By.xpath("//form[@id='book_hotel_form']//child::input[@id='book_now']"));
		click_on(booknow);
		
		
		WebElement bookconfirmation = driver.findElement(By.xpath("//form[@id='booking_form']//child::td[text()='Booking Confirmation ']"));
        Scroll_Into_View(bookconfirmation);
		
        Takes_Screen_Shot(bookconfirmation, "C:\\Users\\hi\\eclipse-workspace\\Maven_Demo\\XscreenShots\\orderconfirmation.png");
		
		Sleep(2000);
		
		WebElement myitinerary = driver.findElement(By.xpath("//form[@id='booking_form']//child::input[@id='my_itinerary']"));
		click_on(myitinerary);
		
		Sleep(2000);
		
		 Takes_Screen_Shot(bookconfirmation, "C:\\Users\\hi\\eclipse-workspace\\Maven_Demo\\XscreenShots\\orderhistory.png");
		
		
		Sleep(1000);
		WebElement logout = driver.findElement(By.xpath("//td[@class='welcome_menu']//child::a[text()='Logout']"));
		click_on(logout);
		
	}


}
