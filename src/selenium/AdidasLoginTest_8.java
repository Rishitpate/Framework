package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdidasLoginTest_8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.findElement(By.id("login-email")).sendKeys("test@test.com");
		driver.findElement(By.id("login-password")).sendKeys("djfdhghfdgfdfg");
		driver.findElement(By.xpath("//button[@aria-label='Log in']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']"))));
		String ExpectedErr = "Incorrect email/password – please check and retry";
		String ActualErr = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		System.out.println(ActualErr);
		
		if(ExpectedErr.equals(ActualErr)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
	}

}
