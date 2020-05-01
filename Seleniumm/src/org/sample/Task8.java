package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement btn1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		btn1.click();
		Alert ac= driver.switchTo().alert();
		Thread.sleep(1500);
		ac.accept();
		WebElement btn2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		btn2.click();
		WebElement btn3 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btn3.click();
		ac.dismiss();
		Thread.sleep(2000);
		WebElement btn4 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btn4.click();
		WebElement btn5 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		btn5.click();
		Alert acc= driver.switchTo().alert();
		Thread.sleep(2000);
		acc.sendKeys("pavithra");
		acc.accept();
	}

}
