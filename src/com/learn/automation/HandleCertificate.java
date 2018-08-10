package com.learn.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleCertificate {

	public static void main (String args[]) throws InterruptedException
	{
		/*
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.ie.driver", "D:\\chromedriver_win32\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver(cap);
		driver.get("https://www.cacert.org");
		*/
		
		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(
		    InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
		    true);
		System.setProperty("webdriver.ie.driver", "D:\\chromedriver_win32\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);
		driver.get("https://www.cacert.org");
		
		
		
		
	}
	
	
	
}
