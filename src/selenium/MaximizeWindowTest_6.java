package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindowTest_6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//To mazimize the window, which opens from the above code.
		driver.manage().window().maximize();

	}

}
