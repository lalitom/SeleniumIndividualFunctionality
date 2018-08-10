package com.learn.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findinvisibleelement {
	
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedrivernew\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	//hidden element 
	//driver.findElement(By.id("male")).click();
	
	// as it is hidden element we are unable to find the location of this element
	int x= driver.findElement(By.id("male")).getLocation().getX();
	int y= driver.findElement(By.id("male")).getLocation().getY();
	System.out.println("Coordinates for x is "+ x);
	System.out.println("Coordinates for y is "+y);
	
	// way to locate hidden elements 
	
	List<WebElement> radio =driver.findElements(By.id("male"));
	int count = radio.size();
	
	for (int i=0;i<count;i++)
	{
		int x1=radio.get(i).getLocation().getX();
		
		if (x1!=0)
		{
			
			radio.get(i).click();
			System.out.println(x1);
			Thread.sleep(500);
			break;
		}
		
		
	}
	

	
	driver.quit();
	}

}
