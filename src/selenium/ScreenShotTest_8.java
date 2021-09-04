package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest_8 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");

		//File is a class in Selenium, just like Webelement, which allows us to store the type file.
		File scrFile = driver.getScreenshotAs(OutputType.FILE); //This is how to take screenshot for any driver of Firefox, Chrome.
		
		//FileUtils is a class which allows us to perform operations on the class File. The method used here is .copyFile(scr File, Dest File);
		FileUtils.copyFile(scrFile, new File("C:\\Testing\\screnshot.png")); //create a png file in a destination folder from scr File, which is stored in Java Memory
		
		//File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.File); this line is for WebDriver to take a screenshot.
	}

}
