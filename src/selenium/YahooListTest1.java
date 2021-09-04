package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> HeaderList = driver.findElements(By.xpath("//ul[@role='presentation']/li")); 
		System.out.println(HeaderList.size());
		
		for(int i=0; i<HeaderList.size();i++) {
			System.out.println(HeaderList.get(i).getText());

	}
	}
}
