package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		
		//className objName = new ClassName();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//ParentClass(Interface) objName = new ClassName();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("fdguiydfguiydfgiudfg"); 
		driver.findElement(By.id("pass")).sendKeys("jgdfguihfdgujhfdg"); 
		driver.findElement(By.name("login")).click();
	}

}
