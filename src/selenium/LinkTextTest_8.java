package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest_8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abo")).click();
		
		//Thread.sleep(2000); //Will stop execution for 2 seconds
		
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News")); //explicit wait
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		wait.until(ExpectedConditions.urlContains("https://about.google/"));
		String expectedUrl = "https://about.google/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(expectedTitle.equals(actualTitle) & actualUrl.contains(expectedUrl)) {
			System.out.println("Passed");
		}else {
			System.out.println("Fail");
		}

	}

}

