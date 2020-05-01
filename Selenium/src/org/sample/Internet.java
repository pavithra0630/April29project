package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internet {

	public static void main(String[] args) {
		System.getProperty("webdriver.ie.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Library\\Driver\\IEDriverServer_x64_3.150.1.zip");
	
		WebDriver driver = new InternetExplorerDriver();

		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");

	}

}
