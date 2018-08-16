package com.learn.automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	
	
	public static void main (String args[]) throws IOException
	{
	 System.setProperty("webdriver.chrome.driver", Common.chromepath);
	 Common.driver=new ChromeDriver();
	 Common.driver.manage().window().maximize();
	 Common.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 Common.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 try 
	 {
	 Common.driver.get("http://www.google.com");
	 Common.driver.findElement(By.name("q1")).sendKeys("Harvard");
	 }
	 catch(Exception e)
	 {
		 File screenshotFile =((TakesScreenshot)Common.driver).getScreenshotAs(OutputType.FILE);
		 long timeunit=System.currentTimeMillis();
		 FileUtils.copyFile(screenshotFile, new File("D:\\Prachir\\SeleniumLearningProjects\\resources\\"+timeunit+"automationscreenshot.png"));
	 }
		
		Common.driver.close();
		
		
	}
	

}
