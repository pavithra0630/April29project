package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement np = driver.findElement(By.id("email"));
		np.sendKeys("lakshmipriya");
		WebElement np1 = driver.findElement(By.id("pass"));
		np1.sendKeys("subi");
		WebElement np3 = driver.findElement(By.id("u_0_2"));
		np3.click();
		
		
		
	}

}
