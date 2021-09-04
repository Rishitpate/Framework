package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListTest_6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(dropdown.size());
		
		for(int i = 0; i<dropdown.size();i++) {
			if(dropdown.get(i).isSelected()) {
				System.out.println(dropdown.get(i).getText()+"--------"+dropdown.get(i).isSelected());
				break;
			}
			
		}
		
		//DropDownList - Selecting a value
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);
		
		s.selectByIndex(2); //Art Selected
		Thread.sleep(2000);
		
		s.selectByValue("2984"); //Baby Selected
		Thread.sleep(2000);
		
		s.selectByVisibleText("Books"); //Books Selected
		System.out.println("-------------------------------After Selection-------------------------");
		
		for(int i = 0; i<dropdown.size();i++) {
			if(dropdown.get(i).isSelected()) {
				System.out.println(dropdown.get(i).getText()+"--------"+dropdown.get(i).isSelected());
				break;
			}
			
		}
		}

	}


