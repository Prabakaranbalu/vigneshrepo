package org.mouseover;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinoth\\eclipse-workspace\\MouseOverAction\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button [@class=\"_2AkmmA _29YdH8\"]")).click();
	WebElement  move = driver.findElement(By.xpath("(//span[@class=\"_1QZ6fC _3Lgyp8\"])[6]"));
	Actions hot = new Actions(driver);
	hot.moveToElement(move).perform();	
	WebElement move2= driver.findElement(By.xpath("//a[text()='Office Chairs']"));
	move2.click();
	Thread.sleep(3000);
	String ParentWindow = driver.getWindowHandle();
	System.out.println("Parent Window: "+ParentWindow);
	WebElement Chair = driver.findElement(By.xpath("(//a[text()='Ks chairs Leatherette Office Arm Chair'])[2]"));
	Chair.click();
	Thread.sleep(5000);
	Set<String> windows = driver.getWindowHandles();
	for(String handle: windows) {
		 if(!handle.equals(ParentWindow)){
	            driver.switchTo().window(handle);
	            Thread.sleep(1000);
	            System.out.println("Title of the new window: " +
	driver.getTitle());
	
	            }
	}
//	System.out.println("Price: "+ driver.findElement(By.className("_1vC4OE _3qQ9m1")).getText());
	WebElement go = driver.findElement(By.xpath("//input[@id=\"pincodeInputId\"]"));
	go.click();
	go.sendKeys("600097");
	WebElement type = driver.findElement(By.xpath("//span[@class=\"_2aK_gu\"]"));
	type.click();
	
	
	
	
	}

}
