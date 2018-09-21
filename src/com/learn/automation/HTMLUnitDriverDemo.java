package com.learn.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverDemo {

	public static void main(String[] args) {

		
HtmlUnitDriver htmlunitdriver=new HtmlUnitDriver();
htmlunitdriver.setJavascriptEnabled(true);
htmlunitdriver.get("http://google.com");
// you can also use WebDriver driver=new HtmlUnitDriver();
System.out.println("Title of the page is -> " + htmlunitdriver.getTitle());
//find the search edit box on the google page
		WebElement searchBox = htmlunitdriver.findElement(By.name("q"));

		// type in Selenium
		searchBox.sendKeys("Selenium");

		// find the search button
		WebElement button = htmlunitdriver.findElement(By.name("btnK"));

		// Click the button
		button.click();

		System.out.println("Title of the page is -> " + htmlunitdriver.getTitle());
	}

}
