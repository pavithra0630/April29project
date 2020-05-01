package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
	public static void main(String[] args) {
		
System.getProperty("webdriver.gecko.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium\\Library\\Driver\\IEDriverServer_x64_3.150.1.zip");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		
	}

}
