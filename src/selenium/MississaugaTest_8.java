package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest_8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		
		WebElement OO = driver.findElement(By.xpath("//button[contains(text(),'Our organization')]"));
		OO.click();
		Thread.sleep(2000);
		
		List <WebElement> dropdown = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(dropdown.size());
		
		for(WebElement a: dropdown) {
			System.out.println(a.getText());
			if(a.getText().equals("Jobs and volunteer")) {
				a.click();
				System.out.println(driver.getTitle());
				break;
			}
		}
		
		

	}

}
