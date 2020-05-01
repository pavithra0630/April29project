package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskk3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement about = driver.findElement(By.xpath("//span[text()='ABOUT'][1]"));
		about.click();
		WebElement contact = driver.findElement(By.xpath("//span[text()='Contact Us'][1]"));
		contact.click();
		WebElement name = driver.findElement(By.xpath("//input[@name='your-name']"));
		name.sendKeys("pavithra");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("pavithraramesh07@gmail.com");
		WebElement mobileno = driver.findElement(By.xpath("//input[@name='your-mobile']"));
		mobileno.sendKeys("9551332604");
		WebElement city = driver.findElement(By.xpath("//input[@name='your-city']"));
		city.sendKeys("chennai");
		WebElement country = driver.findElement(By.xpath("//input[@name='your-country']"));
        country.sendKeys("india");
		WebElement company = driver.findElement(By.xpath("//input[@name='your-company']"));
        company.sendKeys("GreensTech");
		WebElement message = driver.findElement(By.xpath("//textarea[@name='your-message']"));
		message.sendKeys("i am pavithra studying in greens technology");

        
        
		
	}

}
