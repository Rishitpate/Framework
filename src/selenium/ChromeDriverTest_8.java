package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest_8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("dfjfghhfgrishit");
		
		driver.findElement(By.name("pass")).sendKeys("dfjkhdfjhsdf");
		
		driver.findElement(By.name("login")).click();

	}

}
