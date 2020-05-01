package org.tes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Taskk5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(driver);
		a.moveToElement(courses).perform();
		WebElement courses1 = driver.findElement(By.xpath("//span[text()='Software Testing Training ']"));
		a.moveToElement(courses1).perform();
		WebElement courses2 = driver.findElement(By.xpath("//span[text()='Selenium Training']"));
		courses2.click();
		WebElement s1 = driver.findElement(By.xpath("//p[contains(text(),'Object Design Pattern')]"));
		String text = s1.getText();
		System.out.println(text);
		

	}
}