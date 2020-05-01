package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Library\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement scrolldown = driver.findElement(By.xpath("//span[text()='Greens Technologys Overall Reviews']"));
		js.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
		
	     Thread.sleep(3000);
	     
     	WebElement scrolldown1= driver.findElement(By.xpath("//span[text()='Greens Technologys Overall Reviews']"));
     	String text = scrolldown1.getText();
     	System.out.println(text);
     	driver.quit();

	     
	     
        

		
		
		
		
		
		
	}

}
