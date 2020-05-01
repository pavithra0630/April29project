package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumm {

	public static void main(String[] args) {

		System.getProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\src\\org\\sample\\Seleniumm.java.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://gmail.com/");
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://www.flipkart.com/");
		

	}

}
