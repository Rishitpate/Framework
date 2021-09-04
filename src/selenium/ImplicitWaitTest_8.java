package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest_8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//Instead of waiting for a fixed time using Thread.sleep,this performs the action as soon as it findElement.
		//Application to all lines below it, strictly to .findElement lines
		//Not Applicable to .findElements. Use the above three and this implicit wait line.
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //not fixed seconds, it's max seconds
		
		driver.findElement(By.linkText("Create New Account")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys("byebye");
		driver.findElement(By.name("reg_email__")).sendKeys("6477729479");
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("7");
		
		WebElement date = driver.findElement(By.id("day"));
		Select d = new Select(date);
		d.selectByValue("10");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("2000");
		
		
		driver.findElement(By.name("websubmit")).click(); 
		

	}

}
