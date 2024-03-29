package org.mouse;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinoth\\eclipse-workspace\\MouseOverAction\\Driver\\chromedriver.exe");
	WebDriver demo = new ChromeDriver();
	demo.get("http://demo.guru99.com/test/drag_drop.html");
	WebElement bank = demo.findElement(By.xpath("(//li[@data-id='5'])[1]"));
	WebElement lock= demo.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Actions drag = new Actions (demo);
	drag.dragAndDrop(bank, lock).perform();
	
}
}
