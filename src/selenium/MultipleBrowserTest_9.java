package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowserTest_9 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("C:\\Testing\\prop.properties");
		Properties p = new Properties();
		p.load(f);
		
				
		String browser = p.getProperty("browser"); //this value we will read from Data Files... excel, properties file, etc.
		WebDriver driver;
		
		if(browser.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.setProperty("webdriver.ie.driver", "C:\\Selenium Jars\\iedriver.exe");
			 driver = new InternetExplorerDriver();
		}
		
		
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("dfjfghhfgrishit");
		driver.findElement(By.cssSelector("#pass")).sendKeys("dfjkhdfjhsdf");
		driver.findElement(By.cssSelector("[name='login']")).click();

	}

}
