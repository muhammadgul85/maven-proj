package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class iframe_List_Ex1 
{
	WebDriver driver;

  @BeforeClass
  public void beforeClass() 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://chercher.tech/practice/frames");
	  driver.manage().window().maximize();
	  
  }
  
  @Test(priority = 0)
  public void Title_Verification() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  System.out.println("Title is: " + driver.getTitle());
	  
	  String TopicText = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
	  System.out.println("Topic Text is: " + TopicText);
	  
  }
  @Test(priority=1)
  public void Topic_test() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  driver.switchTo().frame("frame1");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Topic Text");
	  //driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	  
	  driver.switchTo().defaultContent();
	    
	  driver.switchTo().frame("frame2");
	  WebElement selectelement = driver.findElement(By.xpath("//select[@id='animals']"));
	  Select sel = new Select(selectelement);
	  
	  
	  sel.selectByVisibleText("Cat");
	  Thread.sleep(3000);
	  sel.selectByValue("babycat");
	  Thread.sleep(3000);
	  sel.selectByIndex(3);
	  
	 
		 
		 // this is not working
		  
		  
		  List<WebElement> li = sel.getOptions();// List function not working
		  System.out.println("List size: "+ li.size());
		  
		  for (int i = 0; i < li.size(); i++) 
		  { 
			  li.get(i).click();
		  System.out.println("List" + li.get(i).getText()); 
		  
		  }
		 
	  
	  driver.switchTo().defaultContent();
	  	  
  }
  
  @Test(priority =2)
  public void innerFrame_CheckBox() throws InterruptedException
  {
	 Thread.sleep(3000);
	 driver.switchTo().frame("frame1");// what is inner frame and iframe, i tried with frame3 but didn't work
	 driver.switchTo().frame("frame3");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 //this isn't working either
	 String text = driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']")).getText();
	 System.out.println("text is: " + text);
	 
	 Thread.sleep(3000);
	 WebElement checkbox =  driver.findElement(By.xpath("//input[@type='checkbox']")); ////input[@id='a'] both unique locators but don't work
	 checkbox.click(); 
	 
	 Thread.sleep(5000);
	 driver.switchTo().defaultContent();
  }

  @AfterClass
  public void afterClass() 
  {
	  
	  System.out.println("All Tests Executed, Browser closed");
	  driver.close();
  }

}