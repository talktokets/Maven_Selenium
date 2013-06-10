package com.google;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest 
{
	WebDriver driver;
	@Test(description="This will open browser with google.com",invocationCount=3)
	public void Test1()
	{
		
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}
}
