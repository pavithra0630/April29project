package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Library\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://gmail.com/");
		driver.get("http://www.flipkart.com/");
		driver.get("https://www.facebook.com/");
		
	
		
		
		
	}
	

}
