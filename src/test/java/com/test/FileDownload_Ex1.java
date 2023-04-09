package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownload_Ex1 {
	WebDriver driver;
	
	@Test
	public void File_Download() throws InterruptedException
	{
		
		 //System.setProperty("webdriver.chrome.driver\",\r\n" +\"C:\\\\Users\\\\User\\\\Documents\\\\Drivers\\\\chromedriver.exe");	
		 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Documents\\Drivers\\chromedriver\\chromedriver.exe");
 
		  String fileDownloadPath = "C:\\Users\\User\\Desktop\\Java";
		  
		  Map<String, Object> prefsMap = new HashMap<String, Object>();
		  prefsMap.put("profile.default_content_settings.popups", 0);
		  prefsMap.put("download.default_directory", fileDownloadPath);
		  
		  ChromeOptions option = new ChromeOptions();
		  option.setExperimentalOption("prefs", prefsMap);
		  // option.addArguments("--test-type");
		  option.addArguments("--disable-extensions");
		  
		  WebDriver driver  = new ChromeDriver(option);
		  driver.get("https://www.seleniumhq.org/download/");
	  	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	  driver.manage().window().maximize();
	  	  Thread.sleep(2000);
	  	  driver.findElement(By.linkText("64 bit Windows IE")).click();
	  	  System.out.println("Downloaded");
		
	  	  
	  	  
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\User\\Documents\\Drivers\\chromedriver.exe");
		 * 
		 * driver = new ChromeDriver();
		 * 
		 * 
		 * 
		 * driver.get("http://demo.guru99.com/test/yahoo.html"); WebElement
		 * downloadButton = driver.findElement(By.id("messenger-download")); String
		 * sourceLocation = downloadButton.getAttribute("href"); String wget_command =
		 * "cmd /c C:/Users/User/Desktop/Java/msgr11us.exe -P D: --no-check-certificate "
		 * + sourceLocation;
		 * 
		 * try { //what is this exit value 2 referring for error, why value 2 //How to
		 * handle the pop up on window once the program is run //where it wants to make
		 * changes in program Process exec = Runtime.getRuntime().exec(wget_command);
		 * int exitVal = exec.waitFor(); System.out.println("Exit value: " + exitVal); }
		 * catch (InterruptedException | IOException ex) {
		 * System.out.println(ex.toString()); } driver.close();
		 */
			}
	
			}
