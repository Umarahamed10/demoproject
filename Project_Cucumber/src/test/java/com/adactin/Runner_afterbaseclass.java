package com.adactin;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.collectData.Singleton_class;
import com.projectobjectmodel.Page_object_manger;

public class Runner_afterbaseclass extends Adactin_Utility_files{

	
	public static WebDriver driver =browser_lanch("chrome");

	  public static  Page_object_manger manager=new Page_object_manger(driver);
	  
	 public static Logger logs=Logger.getLogger(Runner_afterbaseclass.class);
	  
		public static void main(String[] args) throws IOException, InterruptedException {
			
			PropertyConfigurator.configure("log4j.properties");
			
			get_url("http://adactinhotelapp.com/index.php");
			
			logs.info("session created------->");
			
			String getusername = Singleton_class.getinstance_Sc().getinstance_ID().getusername();
			
			send_keys(manager.getlog().getusername(), getusername);
			
			String getpassword = Singleton_class.getinstance_Sc().getinstance_ID().getpassword();
			
			send_keys(manager.getlog().getpassword(), getpassword);
		
			click_on(manager.getlog().getlogin());
			
			logs.info("Fully Completed");
			
			
				
  }
}
