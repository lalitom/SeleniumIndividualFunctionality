package com.learn.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		String url="http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedrivernew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//div/a[@href='http://www.google.com']")).click();
		Set<String> allwindows=driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println("Total windows"+count);
		
		for (String child:allwindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				//do any operation on new screen
				System.out.println("the title of child window is "+driver.getTitle());
				Thread.sleep(4000);
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parent);
		System.out.println("the title of parent window is "+driver.getTitle());
	
		driver.quit();
		
	}
	


}
