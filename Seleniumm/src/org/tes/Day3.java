package org.tes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement txt = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		txt.click();
		WebElement t1 = driver.findElement(By.id("InputName"));
		t1.sendKeys("pavithra");
		WebElement t2 = driver.findElement(By.id("InputEmail1"));
		t2.sendKeys("pavithra21@gmail.com");
		WebElement t3 = driver.findElement(By.id("InputSubject"));
		t3.sendKeys("9551332604");
		WebElement t4 = driver.findElement(By.xpath("//select[@name='courses'][1]"));
		t4.click();
		WebElement t5 = driver.findElement(By.xpath("//option[text()='Software Testing'][1]]"));
		t5.sendKeys("Software Testing");
		
		
        
      
		

	}
}
