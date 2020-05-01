package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\TestSample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/automation-practice-form/");

		WebElement selenium = driver.findElement(By.xpath("//span[text()='Selenium Training'][1]"));
		selenium.click();
		for (int i = 1; i <= 16; i++) {
			System.out.println(i);
		}

	}

}
