package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=hytVwzHNTpc&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiaHl0Vnd6SE5UcGMiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYyOTczMjk5MSwiaWF0IjoxNjI5NzMxNzkxLCJqdGkiOiIyYjhkMWY3ZC0zYzMwLTQwNTItOTgzNC03ZDU1YWE1YzFmNDYiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.bX7_qs20EoQEJrXaQ-N9CRNEA_qRJndmigpjs4ul_r8SC9LGf_0n9teYehDYKZky2FjNmIcGcsgLoHxrUmghuK7LBv-idnFhWOlY1dxsip2FOnWwX1ddYheHX_g8ARg4HeY7PUk1Jli-XDgWUG96t3fkOerU6gTYAorlPUEh2mPuRWPqhOBj20Phit_lPUNRKN2AM28qcpsmXg6rVpshTT2-VCJ3oY7UnIHNkaBBG2E0WTYSy0fUCv6FUGe3gdxCqLFVfGr6uWEzHRNIvqT_JonZsK2KV02a63Wo218xvy-HVIO4z5bLaIsTpYAtlrgTM_wivRratfr65QB3pRuHPQ&preferred_environment=");
		
		driver.findElement(By.name("usernameInput")).sendKeys("dhfgdhfgds");

		driver.findElement(By.name("password")).sendKeys("dfjhdfjhdfd");
		
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER); // to press enter on keyboard.
		
		Thread.sleep(2000);
				
		String expectedErrMsg = "Please check your card number / username or password and try again.";
		String actualErrMsg = driver.findElement(By.xpath("//div[@id='globalError']/div[1]/div[2]")).getText();
		System.out.println(actualErrMsg);
		
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
			
		}
	}

}
