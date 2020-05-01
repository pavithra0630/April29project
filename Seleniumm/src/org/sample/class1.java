package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class class1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement s = driver.findElement(By.xpath("//a[@class='activeLink']"));
		Actions acc= new Actions(driver);
		acc.contextClick(s).perform();
		WebElement s1 = driver.findElement(By.xpath("//span[text()='Java Training ']"));
		
	}

}
