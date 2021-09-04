package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		//When you have space in className, we cannot use it directly.
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("djfkdhfjhgfjdkghfg");
		
		//Needs to learn CSS Selector
		//driver.findElement(By.cssSelector("")).sendKeys("kgghkghjklghgh");

		//Id - for Id attribute; Working
		//driver.findElement(By.id("email")).sendKeys("djhfdhfdfguufg");
		
		//LinkText - Use for Links
		//driver.findElement(By.linkText("")).sendKeys("djkfhdhufgdyuf");
		
		//Name - Use for name attribute; Working
		driver.findElement(By.name("email")).sendKeys("dfjfghhfgrishit");
		
		//PartialLinkText - Use for links only, not applicable here
		//driver.findElement(By.partialLinkText("fgkjfg")).sendKeys("dfjkhdfjhdf");
		
		//Tagname - Use for tag name, usually not unique.
		//driver.findElement(By.tagName("input")).sendKeys("fgkhfgjhfg");
		
		//Xpath - need to learn syntax.
		//driver.findElement(By.xpath("fjghjfgkhkfdg")).sendKeys("jdfhjdfhdjfk");
		
		//PassWord 
		driver.findElement(By.name("pass")).sendKeys("dfjkhdfjhsdf");
		
		//Login Button
		driver.findElement(By.name("login")).click();
	}

}
