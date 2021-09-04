package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest_7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		
		//To perform hover action on a WebElement (keep your cursor out your window)
		//Create an "Action" class, to perform actions on Webelements
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		
		List <WebElement> ElectronicsTop = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
		System.out.println(ElectronicsTop.size());
		
		//Traditional ForLoop
		//for (int i=0; i<ElectronicsTop.size();i++) {
			//System.out.println(ElectronicsTop.get(i).getText());
		//}
		
		//For Each loop
		for(WebElement a: ElectronicsTop) {
			System.out.println(a.getText());
		}

	}

}
