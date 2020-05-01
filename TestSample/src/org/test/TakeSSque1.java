package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSSque1 {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\TestSample\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("C:\\Users\\admin\\eclipse-workspace\\TestSample\\Output\\greens.png");
		
		FileUtils.copyFile(source, dest);

}
}