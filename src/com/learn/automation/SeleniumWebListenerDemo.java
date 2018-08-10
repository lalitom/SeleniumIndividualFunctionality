package com.learn.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

class EventHandler implements WebDriverEventListener
{

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		System.out.println("After Alert accept "+arg0.toString());
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		System.out.println("After Alert dismiss "+arg0.toString());
		
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1,
			CharSequence[] arg2) {
		System.out.println("After Change Value "+arg0.toString());
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("After Click On "+arg0.toString());
		
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("After Find By "+arg0.toString());
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		System.out.println("After Naviagte Back "+arg0.toString());
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("After Navigate Forward "+arg0.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		
		System.out.println("After Navigate Refresh "+arg0.getCurrentUrl());
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("After Navigate To "+arg1.getCurrentUrl());
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		System.out.println("After Script "+arg0.toString());
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		System.out.println("Before Alert Accept "+arg0.toString());
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		System.out.println("Before Alert Dismiss "+arg0.toString());
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1,
			CharSequence[] arg2) {
		System.out.println("Before Change Value "+arg0.toString());
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("Before Click On "+arg0.toString());
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("Before Find By "+arg0.toString());
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		System.out.println("Before Navigate Forward "+arg0.getCurrentUrl());
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		System.out.println("Before Navigate Forward "+arg0.getCurrentUrl());
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		System.out.println("Before Navigate Refresh "+arg0.getCurrentUrl());
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("Before Naviagte To "+arg0.toString());
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		System.out.println("Before Script "+arg0.toString());
		
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("After Exception "+arg0.toString());
		
	}
	
	
	
	
	
	
	
	
}



class SeleniumWebListenerDemo
{
	public static void main (String args[])
	{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedrivernew\\chromedriver.exe");
		driver = new ChromeDriver();
		EventFiringWebDriver firing=new EventFiringWebDriver(driver);
		EventHandler handler=new EventHandler();
		firing.register(handler);
		firing.get("http://www.google.com");
		firing.findElement(By.id("lst-ib")).clear();
		firing.findElement(By.id("lst-ib")).sendKeys("harvard");
		firing.findElement(By.name("btnK")).click();
		System.out.println("The Page title "+firing.getTitle());
		firing.navigate().back();
		firing.close();
		
	}
	
	
	
	
}