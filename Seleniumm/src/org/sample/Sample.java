
package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		
	WebDriver d1=new ChromeDriver();
	d1.get("https://www.snapdeal.com/login");
	WebElement txtUser = d1.findElement(By.xpath("(//input[@class='col-xs-24'])"));
	txtUser.sendKeys("pavithraramesh07@gmail.com");
	
	}

}
