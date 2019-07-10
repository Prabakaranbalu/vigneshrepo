package org.Drag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinoth\\eclipse-workspace\\MouseOverAction\\Driver\\chromedriver.exe");
	    WebDriver amaze = new ChromeDriver();
	    amaze.get("https://www.amazon.in/");
	    WebElement shop = amaze.findElement(By.xpath("//div[@id=\"nav-shop\"]"));
	    Actions car = new Actions(amaze);
	    car.moveToElement(shop).perform();
	    WebElement hello= amaze.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
	    Actions retail = new Actions (amaze);
	    retail.moveToElement(hello).perform();
	    WebElement charge = amaze.findElement(By.xpath("//span[text()='Power Banks']"));
	    charge.click();	
	}


}
