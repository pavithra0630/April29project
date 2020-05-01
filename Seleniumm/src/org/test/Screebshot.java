package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screebshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		
		TakesScreenshot shot=(TakesScreenshot)d;
		File as = shot.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\output\\amazon.jpeg.png");
		
		FileUtils.copyFile(as, dest);
		
		
		
		
	}

}
