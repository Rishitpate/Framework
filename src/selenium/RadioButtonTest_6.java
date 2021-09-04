package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest_6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> Radiobutton = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(Radiobutton.size());
		
		for(int i = 0; i<Radiobutton.size();i++) {
			System.out.println(Radiobutton.get(i).getAttribute("value")+"-----------"+Radiobutton.get(i).isSelected());
		}
		
		Radiobutton.get(2).click();
		System.out.println("---------------------------------------------------");
		
		for(int i = 0; i<Radiobutton.size();i++) {
			System.out.println(Radiobutton.get(i).getAttribute("value")+"-----------"+Radiobutton.get(i).isSelected());
		}

	}

}
