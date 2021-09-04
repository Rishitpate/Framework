package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest_9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		List <WebElement> popup = driver.findElements(By.className("btn-close"));
		System.out.println(popup.size());
		
		if(popup.size()>0) {
			popup.get(0).click();
		}

		driver.findElement(By.id("search-key")).sendKeys("computer");
	}

}
