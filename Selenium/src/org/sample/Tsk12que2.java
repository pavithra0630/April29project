package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsk12que2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Library\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement down = driver.findElement(By.xpath("//div[@class='textwidget custom-html-widget'][1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		
		WebElement up = driver.findElement(By.xpath("//span[text()='HOME'][1]"));
		js.executeScript("arguments[0].scrollIntoView(False)",up);

		

	}
}
