package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement t1 = d.findElement(By.xpath("//span[text()='ABOUT'][1]"));
		t1.click();
		WebElement t2 = d.findElement(By.xpath("//span[text()='Contact Us'][1]"));
		t2.click();

	}

}
