package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTestHmwr_7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		
		//type iphone
		WebElement men = driver.findElement(By.xpath("//a[@data-path='men']"));
		Actions hover = new Actions(driver);
		hover.moveToElement(men).build().perform();
		
		Thread.sleep(2000);
		
		//get size
		List <WebElement> dropdown = driver.findElements(By.xpath("//div[@id='DesktopMenu-0-1-0']/div[1]/div[2]/a"));
		System.out.println(dropdown.size());
		
		for(WebElement a:dropdown) {
			System.out.println(a.getText());
		}

	}

}
