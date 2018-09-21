package com.learn.automation;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Function;



public class WaitsDemo {
	
	static WebDriver driver=null;
	static String pathtochromedriver ="D:\\allBrowserDrivers\\chromedrivernew\\chromedriver.exe";
	
	public static void main (String args[]){
		
		System.setProperty("webdriver.chrome.driver",pathtochromedriver );
		driver= new ChromeDriver();
		driver.get("http://www.google.com");
		
		//one use of WebDriver wait with polling 
		WebElement elem=driver.findElement(By.name("q"));
		new WebDriverWait(driver,10).pollingEvery(5, TimeUnit.SECONDS).withTimeout(10,TimeUnit.SECONDS).until(ExpectedConditions.visibilityOf(elem));
		By textbox=By.name("q");
		//  simple WebDriverwait without polling
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		
		
		
		
		
		
	}
	
	
	

}
