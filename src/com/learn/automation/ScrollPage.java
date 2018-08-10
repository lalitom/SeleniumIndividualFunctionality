package com.learn.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {
	
	public static void main (String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedrivernew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("http://jqueryui.com");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("scroll(0,400)");
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);
		driver.quit();
		
		
	}

}
