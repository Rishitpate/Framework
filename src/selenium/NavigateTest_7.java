package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest_7 {

	public static void main(String[] args) {
		
		//Interview Question - Difference between driver.get and driver.navigate.to
		//Answer - They are both the same, the only difference is driver. navigate has other options as well.
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get("https://ca.yahoo.com/");
		
		driver.navigate().to("https://ca.yahoo.com/");
		
		driver.navigate().back(); //Click back on web browser
		driver.navigate().forward(); //Click forward on web browser
		driver.navigate().refresh(); //Refresh the browser

	}

}
