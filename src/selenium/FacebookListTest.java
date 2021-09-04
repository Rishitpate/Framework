package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		System.out.println(footerLinks.size());
		
		for(int i=0; i<footerLinks.size();i++) {
			System.out.println(footerLinks.get(i).getText());
		}

	}

}
