package org.Drag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class GreensOracle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinoth\\eclipse-workspace\\MouseOverAction\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	   Thread.sleep(3000);
	driver.get("http://www.greenstech.in/contact.php");
 
	WebElement tech = driver.findElement(By.xpath("//a[text()='Courses']"));
	Actions press = new Actions(driver);	
	press.moveToElement(tech).perform();
	
	
	
	
	//driver.findElement(By.xpath("(//a[@href=\"oracle-training.html\"])[1]"));
	
}
}
