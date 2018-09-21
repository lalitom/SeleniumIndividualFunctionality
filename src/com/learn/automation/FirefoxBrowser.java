package com.learn.automation;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	
	public static void main (String args[])
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\chromedriver_win32\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.close();
	
		
	}
	

}
