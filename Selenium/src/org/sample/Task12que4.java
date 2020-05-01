package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12que4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Library\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','pavitra21@gmail.com')", email);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password'][1]"));
		js.executeScript("arguments[0].setAttribute('value','pavithra')", password);
		
		WebElement Login = driver.findElement(By.xpath("//input[@value='Log In']"));
		js.executeScript("arguments[0].click()", Login);

		

}
}