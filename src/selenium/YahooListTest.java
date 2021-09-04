package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> TrendingNow = driver.findElements(By.xpath("//li[@class='trending-list']//a")); 
		System.out.println(TrendingNow.size());
		
		for(int i=0; i<TrendingNow.size();i++) {
			System.out.println(TrendingNow.get(i).getText());
		}

	}

}
