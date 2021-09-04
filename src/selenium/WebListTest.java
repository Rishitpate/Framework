package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		/*WebElement firstLink = driver.findElement(By.tagName("a")); //Element must be present, unique
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));//Even if there is no element, it will execute and print 0.
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
		}*/
		
		//WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		System.out.println(footerLinks.size());
		
		for(int i=0; i<footerLinks.size();i++) {
			System.out.println(footerLinks.get(i).getText());
		}
	}
}
