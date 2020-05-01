package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Library\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		
	   WebElement p = driver.findElement(By.xpath("((//input[@class='inputtext login_form_input_box'])[1]"));
	    p.sendKeys("pavithra@gmail.com");
	    WebElement p1 = driver.findElement(By.xpath("((//input[@class='inputtext login_form_input_box'])[2])"));
	    p1.sendKeys("pavi123");
	    WebElement p2 = driver.findElement(By.name("(//button[@name='login'])"));
	    p2.click();
	    
	    
	}

}
