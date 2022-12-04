package com.adactin;

import java.io.IOException;


import org.openqa.selenium.WebDriver;

import com.projectobjectmodel.Page_object_manger;

public class Run_After_bassclass extends Adactin_Utility_files{

  public static WebDriver driver =browser_lanch("chrome");

  public static  Page_object_manger manager=new Page_object_manger(driver);
  
 // public static 
  
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		get_url("http://adactinhotelapp.com/index.php");
		
		window_maximize("fullscreen");
		
		send_keys(manager.getlog().getusername(), "Umarahamed1010");
		
		send_keys(manager.getlog().getpassword(), "umar101010");
	
		click_on(manager.getlog().getlogin());
			
		select_by_index(manager.getroom().getlocation(), 8);
		
		select_by_index(manager.getroom().gethotelType(), 2);
		
		select_by_index(manager.getroom().getroomType(), 3);
		
		select_by_index(manager.getroom().getroomNos(), 3);
		
		select_by_index(manager.getroom().getadultRoom(), 2);
		
		select_by_index(manager.getroom().getchildRoom(), 2);
		
		click_on(manager.getroom().getsubmit());
		
		implicitly_Wait(10);
		click_on(manager.gethotels().getradiobutton());
		
		click_on(manager.gethotels().getcontinuebutton());
		
		send_keys(manager.gethotels().getfirstname(), "Ahamed");
		
		send_keys(manager.gethotels().getlastname(), "Umar");
		
		send_keys(manager.gethotels().getaddress(), "PARIS kuruku_santhu");
		
		send_keys(manager.gethotels().getcardnumber(), "9876543212346789");
		
		Sleep(2000);
		
		select_by_index(manager.gethotels().getcardname(), 2);
		
		select_by_index(manager.gethotels().getexpirymonth(), 12);
		
		select_by_index(manager.gethotels().getexpiryyear(), 12);
		
		Sleep(2000);
		
		send_keys(manager.gethotels().getcvvnumber(), "212");
		
		click_on(manager.gethotels().getbooknowbutton());
		
		Scroll_Into_View(manager.gethotels().getbookingview());
		
		Sleep(2000);
        
		Takes_Screen_Shot(manager.gethotels().getbookingview(),
        		"C:\\Users\\hi\\eclipse-workspace\\Maven_Demo\\XscreenShots\\orderconfirmation.png");
		
        click_on(manager.gethotels().getitinerary());
		
		
		Takes_Screen_Shot(manager.gethotels().getitinerary(), 
				"C:\\Users\\hi\\eclipse-workspace\\Maven_Demo\\XscreenShots\\orderhistory.png");
		
		
		Sleep(3000);
		
		click_on(manager.gethotels().getlogoutbutton());
		
  }
	
}
