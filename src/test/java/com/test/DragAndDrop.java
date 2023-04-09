package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver;
	
	@Test
	public void DragDrop() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();//Run Time Polymorphism - Over loading , over riding - inheritance - class and object
		
		//Webdriver = Interface
		//ChromeDriver = Class
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement Target = driver.findElement(By.id("loan"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(src, Target).build().perform();
		
		Thread.sleep(3000);
		//driver.close();
		
		
		
		
	}

}
