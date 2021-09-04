package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		WebElement def = driver.findElement(By.id("gh-ac"));
		String s = def.getAttribute("placeholder");
		System.out.println(s);
		
		if(s.equals("Search for anything")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		def.sendKeys("iphone");
		String p = def.getAttribute("value");
		System.out.println(p);

	}

}
