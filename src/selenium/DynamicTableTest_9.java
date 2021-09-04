package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest_9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List <WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int s = rows.size();
		System.out.println(s);
		
		List <WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		int c = columns.size();
		System.out.println(c);
		
		for(int i = 2;i<=s;i++) {
			for(int j = 1;j<=c;j++) {
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
				System.out.print("  |   ");
				}
			System.out.println();
		}
		
	}

}
