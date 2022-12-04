package com.adactin;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Utility_files {


	public static WebDriver driver;   //------>NULL
	
	
	public static WebDriver browser_lanch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\hi\\eclipse-workspace\\Project\\value\\chromedriver.exe");
             driver=new ChromeDriver();
			
		}
		return driver;
	}
	public static void get_url(String values) {
		
		driver.get(values);
	}
	public static void window_maximize(String max) {
		if (max.equalsIgnoreCase("fullscreen")) {
			driver.manage().window().maximize();
		}
	}
	public static void send_keys(WebElement element, String values) {
	
		element.sendKeys(values);
		
	}
	public static void  click_on(WebElement element) {
		Actions u=new Actions(driver);
		u.click(element).build().perform();
		
	}
	
	public static void Select_by_value (WebElement element,String value) {
		
		Select s=new Select(element);
		
		s.selectByValue(value);
		
	}
	
	public static void select_by_index(WebElement element,int numbers) {
		Select s=new Select(element);
		s.selectByIndex(numbers);
		
	}
	
	public static void Select_by_Visible(WebElement element, String Visible_Text) {
		
		Select s=new Select(element);
		s.selectByVisibleText(Visible_Text);
		
	}
	
	
	public static void  implicitly_Wait(long ofseconds) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ofseconds));
	}
	public static void Scroll_Into_View(WebElement element) {
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView()", element);
	}
	public static void Takes_Screen_Shots(WebElement element,String paths) throws IOException {
		
		TakesScreenshot tss=(TakesScreenshot) driver;
		File base=tss.getScreenshotAs(OutputType.FILE);
		File path=new File(paths);
		FileUtils.copyFile(base, path);
		
	}
	public static void Sleep(long seconds) throws InterruptedException {
		
		Thread.sleep(seconds);
		
	}
	public static void Takes_Screen_Shot(WebElement element,String paths) throws IOException {
		
		TakesScreenshot tss=(TakesScreenshot) driver;
		File base=tss.getScreenshotAs(OutputType.FILE);
		File path=new File(paths);
		FileUtils.copyFile(base, path);
		
	}
	
	
}
