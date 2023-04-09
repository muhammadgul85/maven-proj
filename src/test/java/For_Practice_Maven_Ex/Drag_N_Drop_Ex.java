package For_Practice_Maven_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_N_Drop_Ex {
	
	WebDriver driver;
	
	
	@Test
	public void DragNdropEx() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*
		 * int size = driver.findElements(By.tagName("iframe")).size();
		 * System.out.println("No of Frames : " +size); // we have 3 frames..
		 */		
		//driver.switchTo().frame("iframe");
		driver.switchTo().frame("flow_close_btn_iframe");
		//driver.findElement(By.id("closeBtn")).click();
		System.out.println("Switched to Frame ");
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		System.out.println("Closed the popup/add");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
	
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target =  driver.findElement(By.id("loan"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).build().perform();
		Thread.sleep(3000);
		
		
		
		
		
		
		driver.close();
		
		
	}

}
