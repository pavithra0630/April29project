package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tassk2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtfirst = driver.findElement(By.xpath("//input[@type='text']"));
		txtfirst.sendKeys("pavithra");
		WebElement txtlast = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlast.sendKeys("ramesh");
		WebElement txtadd = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtadd.sendKeys("no 7, 4th cross street,perungudi,chennai");
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
		txtemail.sendKeys("lakshmipriya.subi@gmail.com");
		WebElement phono = driver.findElement(By.xpath("//input[@type='tel']"));
		phono.sendKeys("9884494668");
		WebElement btnfemale = driver.findElement(By.xpath("//input[@value='FeMale']"));
		btnfemale.click();
		WebElement cricket = driver.findElement(By.id("checkbox1"));
		cricket.click();
		WebElement cricket1 = driver.findElement(By.id("checkbox2"));
		cricket1.click();
		WebElement s1 = driver.findElement(By.id("Skills"));
		s1.click();
		WebElement s2 = driver.findElement(By.xpath("//option[text()='Android']"));
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement s3 = driver.findElement(By.id("msdd"));
		s3.click();
		WebElement s8 = driver.findElement(By.xpath("//a[text()='English']"));
		s8.click();
		WebElement s5 = driver.findElement(By.xpath("//label[text()='Languages']"));
		s5.click();
		WebElement s6 = driver.findElement(By.id("countries"));
		s6.click();
		for (int i = 1; i < 14; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
		country.click();
		for (int i = 1; i <= 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement dob = driver.findElement(By.id("yearbox"));
		dob.click();
		dob.sendKeys("1996");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		month.click();
		month.sendKeys("November");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement day = driver.findElement(By.id("daybox"));
		day.click();
		day.sendKeys("6");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		password.sendKeys("Ayyappan123");
		WebElement password1= driver.findElement(By.xpath("//input[@id='secondpassword']"));
		password1.sendKeys("Ayyappan123");

		
		
		
		
		
		}
			
		
	}


