package com.learn.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverdemo {
	
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedrivernew\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
	WebElement elem =driver.findElement(By.xpath("//button[text()='Automation Tools']"));
	Actions act =new Actions(driver);
	act.moveToElement(elem).perform();
	
	List <WebElement> links=driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
	int count= links.size();
	System.out.println("Size of List"+count);
	
	for (int i=0;i<count;i++)
	{
		WebElement element= links.get(i);
		String text =element.getAttribute("innerHTML");
		boolean status=element.isEnabled();
		
		System.out.println("Links name is "+text+"And the status is "+status);
		
		if(text.equalsIgnoreCase("Appium"))
		{
			element.click();
			break;
		}
		
	}
	
	
	

	
    driver.quit();
}

	
}