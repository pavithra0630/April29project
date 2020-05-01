package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	static WebDriver d;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\TestSample\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
	}

	public static void rightClick(WebElement s) {
		s.click();
	}

	public static void close() {
		d.close();
	}

	public static void quit() {
		d.quit();
	}

	public static void pageUrl() {
		String url = d.getCurrentUrl();
		System.out.println(url);
	}

	public static void sendKeys(WebElement e, String s) {
		e.sendKeys(s);

	}

	public void doubleClick(WebElement e) {
		Actions acc = new Actions(d);
		acc.doubleClick(e).perform();

	}

	public static void mouseRightClick() {
		Actions a = new Actions(d);
		a.contextClick();

	}

	public static void dragAndDrop(WebElement source, WebElement dest) {
		Actions a1 = new Actions(d);
		a1.dragAndDrop(source, dest).perform();

	}

	public static void mouseHoveraction(WebElement e) {
		Actions a2 = new Actions(d);
		a2.moveToElement(e).perform();
	}

}
