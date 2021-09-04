package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("djfhdhfgsdf");
		driver.findElement(By.xpath("//div[@id='identifierNext']/div[1]/button[1]")).click();
		
		Thread.sleep(2000);
		
		String expectedErrMsg = "Couldn't find your Google Account";
		String actualErrMsg = driver.findElement(By.className("o6cuMc")).getText();
		System.out.println(actualErrMsg);
		
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		

		
	}

}
