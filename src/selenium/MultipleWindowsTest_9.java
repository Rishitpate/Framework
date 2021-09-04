package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest_9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://moodle.cestarcollege.com/moodle/");
		
		driver.findElement(By.linkText("Faq")).click(); //opens a new Window of FAQ.
		
		//.getWindowHandles return us a set, not a list
		Set <String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		//Iterator class to read a set
		Iterator <String> iter = allWindows.iterator();
		String ParentWindow = iter.next();
		String ChildWindow = iter.next();
		System.out.println(ParentWindow);
		System.out.println(ChildWindow);
		
		//Switching to a new Window
		driver.switchTo().window(ChildWindow); // Need to pass the Handle of the window as the argument in the class"window".
		System.out.println(driver.getTitle()); //FAQ Page Title
		
		driver.close(); //Will Close only your current Window, Will not kill the driver and we can use driver after calling close.
		
		//Switching back to parentWindow
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());// Lambton College Title
		
		//driver.quit(); //Will Kill the driver, close all the windows and browsers opened by the script and cannot use the driver after calling quit.

	}

}
