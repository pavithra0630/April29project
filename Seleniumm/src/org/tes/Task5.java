package org.tes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement sport = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a= new Actions(driver);
		a.moveToElement(sport).perform();
		WebElement sport1 = driver.findElement(By.xpath("//span[text()='Oracle Training ']"));
		a.moveToElement(sport1).perform();
		WebElement micro = driver.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
		micro.click();
		WebElement a1 = driver.findElement(By.xpath("//h1[text()='ORACLE SQL TRAINING IN CHENNAI']"));
		String text = a1.getText();
		System.out.println(text);
		
		
	}

}
