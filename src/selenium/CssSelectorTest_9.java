package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest_9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("dfjfghhfgrishit");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("dfjkhdfjhsdf");
		
		driver.findElement(By.cssSelector("[name='login']")).click();

		
	}

}
