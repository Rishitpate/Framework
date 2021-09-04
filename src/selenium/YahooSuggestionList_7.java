package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionList_7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		driver.findElement(By.id("ybar-sbq")).sendKeys("canada");
		Thread.sleep(2000);
		
		List <WebElement> dropdown = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		int d = dropdown.size();
		System.out.println(d);
		
		for (WebElement a: dropdown) {
			if(a.getText().contains("canada")) {
			System.out.println(a.getText());
		}else {
			System.out.println("Test Failed");
		}
		

	}
	}
}
