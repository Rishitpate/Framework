package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorClassTest_7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en");
		
		
		//Doesn't click on About Us if it is not in view of the browser.
		//Thread.sleep(10000);
		WebElement AboutUs = driver.findElement(By.linkText("About Us"));
		JavascriptExecutor jse = (JavascriptExecutor) driver; //Class which allows us to scroll down on the window.
		
		
		//Code to scroll down and then click
		//Scroll using x and y coordinate
		//jse.executeScript("window.scrollBy(0,4000)");//executeScript is the method which allows us to scroll, argument is "window.scrollBy(x-cord,y-cor).
		//System.out.println(AboutUs.getLocation()); // returns us the (x,y) location of the AboutUs WebElement.
		//AboutUs.click();
		
		//Scroll until the element is in view
		//jse.executeScript("arguments[0].scrollIntoView(true);", AboutUs);
		//AboutUs.click();
		
		//Option 3
		jse.executeScript("arguments[0].click();", AboutUs);
		

	}

}
