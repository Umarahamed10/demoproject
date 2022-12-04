package com.step_defination;


import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.Adactin_Utility_files;
import com.cucumberMethods.AdactinRunner;
import com.projectobjectmodel.Page_object_manger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination extends Adactin_Utility_files{

	public static WebDriver driver = AdactinRunner.driver;
	
	public static Page_object_manger manager=new Page_object_manger(driver);
	
	@Given("user Lanch the Application")
	public void user_lanch_the_application() {
	
		get_url("http://adactinhotelapp.com/index.php");	
	}
	@When("user Enter The {string} In Username Field")
	public void user_enter_the_in_username_field(String username) {
	   
		send_keys(manager.getlog().getusername(), username);
		
	}
	@When("user Entetr The {string} In Password Field")
	public void user_entetr_the_in_password_field(String password) {
	  
		send_keys(manager.getlog().getpassword(), password);
		
	}
	@Then("user Click On The Login Button And It Navigates to Adactin.com-Search Hotel Page")
	public void user_click_on_the_login_button_and_it_navigates_to_adactin_com_search_hotel_page() {
	   
		click_on(manager.getlog().getlogin());
	}
	
	@When("user Select The {string} Location")
	public void user_select_the_location(String location) {
		
         Select_by_value(manager.getroom().getlocation(), location);
	   
	}
	@When("user Select The {string} Hotel")
	public void user_select_the_hotel(String Hotel) {
	   
		Select_by_value(manager.getroom().gethotelType(), Hotel);
		
	}
	@When("user Select The {string} Room Type")
	public void user_select_the_room_type(String Roomtype) {
	   
		Select_by_value(manager.getroom().getroomType(), Roomtype);
		
	}
	@When("user Select The {string} Number Of Rooms")
	public void user_select_the_number_of_rooms(String Numberofrooms) {
	 
		Select_by_value(manager.getroom().getroomNos(), Numberofrooms);
	}
	@When("user Select The {string} Adult Per Room")
	public void user_select_the_adult_per_room(String AdultPerRoom) {
	  
		Select_by_value(manager.getroom().getadultRoom(), AdultPerRoom);
		
	}
	@When("user Select The {string} Children Per Room")
	public void user_select_the_children_per_room(String ChildrenPerRoom) {
	    
		Select_by_value(manager.getroom().getchildRoom(), ChildrenPerRoom);
	}
	@Then("user Click On The Search Button And It Navigates To {string} Page")
	public void user_click_on_the_search_button_and_it_navigates_to_page(String expectedTitle) throws InterruptedException {
		
		click_on(manager.getroom().getsubmit());
		//Sleep(2000);
		//ssert.assertEquals(expectedTitle, driver.getTitle());
	}
	
	@When("user Click on The Radio Button")
	public void user_click_on_the_radio_button() {
	    
		implicitly_Wait(10);
		
		click_on(manager.gethotels().getradiobutton());
		
	}
	@Then("user Click On The Continue Button And It Navigates To {string} Page")
	public void user_click_on_the_continue_button_and_it_navigates_to_page(String expectedTitle) {
	   
		click_on(manager.gethotels().getcontinuebutton());

		//Assert.assertEquals(expectedTitle, driver.getTitle());
	}
	@When("user Enter The {string} In First Name Field")
	public void user_enter_the_in_first_name_field(String firstname) {
	   
		send_keys(manager.gethotels().getfirstname(), firstname);
	}
	@When("user Enter The {string} In Second Name Field")
	public void user_enter_the_in_second_name_field(String lastname) {
	   
		send_keys(manager.gethotels().getlastname(), lastname);
	}
	@When("user Enter The {string} In Billing Address Field")
	public void user_enter_the_in_billing_address_field(String address) {
	    
		send_keys(manager.gethotels().getaddress(), address);
	}
	@When("user Enter The Credit Card No. In Credit Card No. Field")
	public void user_enter_the_credit_card_no_in_credit_card_no_field() {
        send_keys(manager.gethotels().getcardnumber(), "9876543212346789");
			
	}
	@When("user Select The {string} Credit Card Type")
	public void user_select_the_credit_card_type(String cardtype) {
	   
		Select_by_value(manager.gethotels().getcardname(), cardtype);
	}
	@When("user Select The {string} Expiry Month In The Expiry Date")
	public void user_select_the_expiry_month_in_the_expiry_date(String expirymonth) {
	  
		Select_by_value(manager.gethotels().getexpirymonth(), expirymonth);
	}
	@When("user Select The {string} Expiry Year In The Expiry Date")
	public void user_select_the_expiry_year_in_the_expiry_date(String expiryyear) {
	   
		Select_by_value(manager.gethotels().getexpiryyear(), expiryyear);
	}
	@When("user Enter The CVV Number In CVV Number Field")
	public void user_enter_the_cvv_number_in_cvv_number_field() throws InterruptedException {

		Sleep(2000);
		
		send_keys(manager.gethotels().getcvvnumber(), "414");
	}
	@Then("user Click On The Book Now Button And It Navigates To {string} Page")
	public void user_click_on_the_book_now_button_and_it_navigates_to_page(String expectedTitle) {
	   
		click_on(manager.gethotels().getbooknowbutton());
		

		//Assert.assertEquals(expectedTitle, driver.getTitle());
		
	}
	@When("user Click On The My Itinerary Button And It Navigates To {string} Page")
	public void user_click_on_the_my_itinerary_button_and_it_navigates_to_page(String expectedTitle) throws IOException, InterruptedException {
	    
		Takes_Screen_Shot(manager.gethotels().getbookingview(),
        		"C:\\Users\\hi\\eclipse-workspace\\Project_Cucumber\\ScreenShot\\orderconfirmation1.png");
		
		  Sleep(3000);
		  
        click_on(manager.gethotels().getitinerary());
        
        //Assert.assertEquals(expectedTitle, driver.getTitle());

	}
	
	@When("user Click On The Lagout Button And It Navigates To {string} Page")
	public void user_click_on_the_lagout_button_and_it_navigates_to_page(String expectedTitle) {
	   
		click_on(manager.gethotels().getlogoutbutton());
		
		//Assert.assertEquals(expectedTitle, driver.getTitle());
	}

}
