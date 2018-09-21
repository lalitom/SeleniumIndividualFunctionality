package com.learn.automation;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow1 {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		String url="http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html";
		System.setProperty("webdriver.chrome.driver", "D:\\allBrowserDrivers\\chromedrivernew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//div/a[@href='http://www.google.com']")).click();
		Set<String> allwindows=driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println("Total windows"+count);
		ArrayList<String>tabs=new ArrayList<String>(allwindows);
	    
	    driver.switchTo().window(tabs.get(1));
	    Thread.sleep(10000);
	    driver.close();
		
		driver.switchTo().window(parent);
		System.out.println("the title of parent window is "+driver.getTitle());
	
		driver.quit();
		
	}
	


}
