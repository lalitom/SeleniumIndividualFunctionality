package com.learn.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickCSSSelector {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		String url="http://swisnl.github.io/jQuery-contextMenu/demo.html";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedrivernew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement rightclick=driver.findElement(By.cssSelector(".context-menu-one"));
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		
		WebElement copy=driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		String copyString=copy.getText();
		System.out.println(copyString);
		copy.click();
		
		
		driver.quit();
		
		
		
	}
}
