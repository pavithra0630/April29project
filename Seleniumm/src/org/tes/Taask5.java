package org.tes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Taask5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a= new Actions(driver);
		a.moveToElement(course).perform();
		WebElement data = driver.findElement(By.xpath("//span[text()='Data Warehousing Training ']"));
		a.moveToElement(data).perform();
		
		

}
}