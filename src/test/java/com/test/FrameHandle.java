package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FrameHandle {
	
	WebDriver driver;
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();//Run Time Polymorphism - Over loading , over riding - inheritance - class and object
		
		//Webdriver = Interface
		//ChromeDriver = Class
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	@Test
	public void Method1() throws InterruptedException
	{
		driver.switchTo().frame("frame1");  // Go in to the frame
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Afhdsfhgdfghsdgf");//inside frame
		
		driver.switchTo().defaultContent(); // Outside of the frame
		
		String TopicText= driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		
		System.out.println(TopicText);
		
		driver.close();
		
		
	}

}
