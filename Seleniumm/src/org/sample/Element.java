package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		WebElement p1 = driver.findElement((By.xpath("//a[text()='Sign up']")));
		p1.click();
		
		
		
	}

}
