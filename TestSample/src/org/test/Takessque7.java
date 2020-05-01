package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takessque7 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\TestSample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement htc = driver.findElement(By.xpath("//a[text()='HTC Global Services']"));
		htc.click();
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("C:\\Users\\admin\\eclipse-workspace\\TestSample\\Output\\adyar.png");
		
		FileUtils.copyFile(src, dest);
		


	}
}