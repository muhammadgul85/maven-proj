package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploading {
	
WebDriver driver;
	
	@Test
	public void DragDrop() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();//Run Time Polymorphism - Over loading , over riding - inheritance - class and object
		
		//Webdriver = Interface
		//ChromeDriver = Class
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement ChooseFile=driver.findElement(By.id("uploadfile_0"));
		
		ChooseFile.sendKeys("C:\\Users\\User\\Desktop\\ExcelSheet\\Book3.xlsx");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();
		
		Thread.sleep(3000);
		
		driver.close();
				
	}

}
