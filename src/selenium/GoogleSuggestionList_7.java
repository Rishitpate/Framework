package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionList_7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Canada");
		Thread.sleep(2000);
		
		List <WebElement> dropdown = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		int d = dropdown.size();
		System.out.println(d);
		
		for(WebElement a : dropdown) {
			System.out.println(a.getText());
		}
		

	}

}
