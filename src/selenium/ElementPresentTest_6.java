package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest_6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//We cannot verify using WebElement, WebElement must be present, if not present, code will not run and "Element no Present" will not be printed.
		/*if(driver.findElement(By.LinkText("Abo")).isDisplayed()) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}*/
		
		//To verify if element is present, always use "List <WebElement>".
		List<WebElement> element = driver.findElements(By.linkText("Abo"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}

	}

}
