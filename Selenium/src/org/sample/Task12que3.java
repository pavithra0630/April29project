package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12que3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Library\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement down = driver.findElement(By.xpath("//h2[text()='Relevant Courses']"));
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		
		WebElement print = driver.findElement(By.xpath("//b[text()='Best Selenium training center in OMR']"));
		System.out.println(print);
		
		
		
		
		


}
}