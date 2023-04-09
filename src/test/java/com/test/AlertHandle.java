/**
 * Before Suite
 */

package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertHandle {
	
	WebDriver driver;
	
	@BeforeClass
	public void MethodBefore()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();//Run Time Polymorphism - Over loading , over riding - inheritance - class and object
		
		//Webdriver = Interface
		//ChromeDriver = Class
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
	}
	@Test
	public void Test1() throws InterruptedException
	{
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		Alert alrt = driver.switchTo().alert();
		Thread.sleep(2000);
		alrt.accept();
		alrt.accept();
		//alrt.dismiss();
	}

}
