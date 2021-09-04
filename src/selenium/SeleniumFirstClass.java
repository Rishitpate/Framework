package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		//6 browsers supported by Selenium
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		//className objName = new className();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("fdguiydfguiydfgiudfg"); //type wrong email in emailbox.
		driver.findElement(By.id("pass")).sendKeys("jgdfguihfdgujhfdg"); //type wrong password in password.
		driver.findElement(By.name("login")).click(); //click on login button.

	}

}
