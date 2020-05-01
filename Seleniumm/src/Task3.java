import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement t1 = driver.findElement(By.xpath("//input[@type='email']"));
		t1.sendKeys("pavithra");
		WebElement t2 = driver.findElement(By.xpath("//input[@type='password'][1]"));
		t2.sendKeys("123456");
		WebElement t3 = driver.findElement(By.xpath("//input[@value='Log In']"));
		t3.click();

		

		
	}

}
