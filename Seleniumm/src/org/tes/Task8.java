package org.tes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
          
          WebElement accessories = driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
          Actions acc = new Actions(driver);
          acc.moveToElement(accessories).perform();
          

          Thread.sleep(2000);
          WebElement acc1 = driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
          acc1.click();
          
		
	}

}
