package com.cucumberMethods;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.Adactin_Utility_files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features =  ".//FeatureFiles" ,
		
		glue = "com.step_defination" ,
		
		monochrome = true ,
		
		dryRun = false ,
		
		publish = false ,
		
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:Report/index.html", "json:report/jsreport.json"}
				
				//tags = "@login or @search"
		   
		)
     public class AdactinRunner{
	
	     public static WebDriver driver ;  //--->NULL
	 
	  @BeforeClass
	  public static void set_up() {

	  driver =Adactin_Utility_files.browser_lanch("chrome");	
	  }
	
	  @AfterClass
	  public static  void tear_down() {
		
		driver.close();		
	   }

	
	
}
