package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowHandling {
	WebDriver driver;
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();//Run Time Polymorphism - Over loading , over riding - inheritance - class and object
		
		//Webdriver = Interface
		//ChromeDriver = Class
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	@Test
	public void Method1() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		String MainWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles(); // set is using for removing duplicacy
		
		Iterator<String> it = childWindow.iterator();
		while(it.hasNext())
		{
			String Cwindow = it.next();
			
			if(!MainWindow.equalsIgnoreCase(Cwindow))
			{
				driver.switchTo().window(Cwindow);
				
				System.out.println("Control Child Window");
				driver.findElement(By.name("emailid")).sendKeys("mansari1187@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				
				Thread.sleep(4000);
				
				driver.close();
				
				
			}
			
		}
		
		driver.switchTo().window(MainWindow);
		
		driver.findElement(By.xpath("//a[text()='Insurance Project']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
	}
	
}
