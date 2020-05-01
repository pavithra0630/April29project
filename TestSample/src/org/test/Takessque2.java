package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takessque2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\TestSample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement scrolldown = driver.findElement(By.xpath("//div[text()='Other Tutorials']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		

	}
}
