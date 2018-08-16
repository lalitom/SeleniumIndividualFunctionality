package com.learn.automation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertDemo {
	static WebDriver driver=null;
	//static String Pathofchromedriver="D:\\chromedriver_win32\\chromedrivernew\\chromedriver.exe";
	public static void main (String args[]) throws InterruptedException
	{
		System.out.println("Simple Alert Demo------->");
		setup();
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
	    Alert SimpleAlert =driver.switchTo().alert();
		String alertText=SimpleAlert.getText();
		System.out.println("Alert text is "+alertText);
		Thread.sleep(1000);
		SimpleAlert.accept();
		close();
		System.out.println("Confirmation Alert Demo------->");
		setup();
		WebElement elem= driver.findElement(By.xpath("//*[@id='content']/p[8]/button"));
		JavascriptExecutor js = (JavascriptExecutor)(driver);
		js.executeScript("arguments[0].click()", elem);
		Alert confirmationalert= driver.switchTo().alert();
		String alerttext=confirmationalert.getText();
		System.out.println("Alert text is "+alerttext);
		confirmationalert.dismiss();
		close();
		System.out.println("Prompt Alert Demo------->");
		setup();
		WebElement element = driver.findElement(By.xpath("//*[@id='content']/p[11]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
 
		Alert promptAlert  = driver.switchTo().alert();
		String alertText1 = promptAlert .getText();
		System.out.println("Alert text is " + alertText1);
		//Send some text to the alert
		promptAlert .sendKeys("Accepting the alert");
		Thread.sleep(4000); //This sleep is not necessary, just for demonstration
		promptAlert .accept();
		close();
		
	}
	
	
	static void setup()
	{
		String url="http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/";
		System.setProperty("webdriver.chrome.driver",Common.chromepath);
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}

	public static void close()
	{
		driver.close();
	}
	
}
