package com.learn.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		String url="https://jqueryui.com/droppable/";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedrivernew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement sourceElement= driver.findElement(By.id("draggable"));
		WebElement targetElement= driver.findElement(By.id("droppable"));
		Actions act =new Actions(driver);
		act.clickAndHold(sourceElement).dragAndDrop(sourceElement, targetElement).release().build().perform();
		
		
		
		
		
	}
}
