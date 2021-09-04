package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTestHomeWrk_7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		//type iphone
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		
		Thread.sleep(2000);
		
		//get size
		List <WebElement> dropdown = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		System.out.println(dropdown.size());
		
		for(WebElement a:dropdown) {
			System.out.println(a.getText());
		}
	}

}
