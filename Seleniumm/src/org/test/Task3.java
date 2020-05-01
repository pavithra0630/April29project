package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement s = driver.findElement(By.id("credit1"));
		WebElement d = driver.findElement(By.id("BANK"));
		Actions acc= new Actions(driver);
        acc.dragAndDrop(s, d).perform();
        
	}

}
