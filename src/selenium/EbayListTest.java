package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> HeaderList = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li/a")); 
		System.out.println(HeaderList.size());
		
		for(int i=0; i<HeaderList.size();i++) {
			System.out.println(HeaderList.get(i).getText());

	}
	}
}
