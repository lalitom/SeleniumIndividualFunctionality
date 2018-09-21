package com.learn.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;








import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class FluentWaitDemo {
	static WebDriver driver=null;
	static String pathtochromedriver ="D:\\allBrowserDrivers\\chromedrivernew\\chromedriver.exe";
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver",pathtochromedriver);
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement elem =driver.findElement(By.name("btnK"));
		String testdisplay=elem.getText();
		System.out.println("text diaply"+testdisplay);
	
		String temp= new FluentWait<WebElement>(elem)
		 .withTimeout(10, TimeUnit.SECONDS)
		 .pollingEvery(2, TimeUnit.SECONDS)
		 .until(new Function<WebElement,String>(){

			@Override
			public String apply(WebElement element) {
				return element.getText();
			}
			
			 
			 
		 });
		 System.out.println(temp);
	
		 Boolean bool=new FluentWait<WebElement>(elem)
		 .withTimeout(10, TimeUnit.SECONDS)
		 .pollingEvery(3,TimeUnit.SECONDS)
		 .until(new Function<WebElement,Boolean>(){

			@Override
			public Boolean apply(WebElement elem) {
				return elem.isDisplayed();
				
			}
			 
			 
		 });
		 System.out.println(bool);
	
		 
		 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.pollingEvery(250, TimeUnit.MILLISECONDS);
			wait.withTimeout(2, TimeUnit.MINUTES);
			wait.ignoring(NoSuchElementException.class); // We need to ignore this
															// exception.

      	Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver arg0) {
					System.out.println("Checking for the object!!");
					WebElement element = arg0.findElement(By.id("dynamicText"));
					if (element != null) {
						System.out.println("A new dynamic object is found.");
					}
					return element;
				}
			};

			wait.until(function);
		
		 
		WebElement we=function.apply(driver);

		 
	}

}
