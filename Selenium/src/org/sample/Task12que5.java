package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12que5 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Library\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement username = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','pavithra')", username);
		
		WebElement password = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','pavithra')", password);
		
		WebElement login = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", login);

		


}

}