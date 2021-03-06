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
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.ie.driver", "D:\\allBrowserDrivers\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver(cap);
		driver.get("https://www.cacert.org");
		
		//here in below code i have set webdriver.ie.driver to chromepath.
		//intialized internetexplorer even desired capbilities are of internet explorer still test runs 
		//and chrome driver is opened up and commands is executed.
		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(
		    InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
		    true);
		System.setProperty("webdriver.ie.driver", "D:\\allBrowserDrivers\\chromedrivernew\\chromedriver.exe");
		WebDriver driver1 = new InternetExplorerDriver(caps);
		driver1.get("https://www.cacert.org");
		
		driver1.close();
		
		
	}
	
	
	
}
