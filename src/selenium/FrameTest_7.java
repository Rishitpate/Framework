package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest_7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//To verify if Sortable is present
		List <WebElement> Sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(Sortable.size());
		
		if(Sortable.size()>0) {
			System.out.println("Sortable Present");
		}else {
			System.out.println("Sortable not Present");
		}
		
		//To verify if draggable is present
		List <WebElement> draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("Draggable Present");
		}else {
			System.out.println("Draggable not Present");
		}
		
		driver.switchTo().frame(0); //by index
		//driver.switchTo().frame("String - id or name"); // by id or name only, not applicable here.
		//driver.switchTo().frame("WebElement"); // WebElement = driver.findElement(By.classname("demo-frame"));
		
		System.out.println("-------------------------------------After switching to frame---------------------");
		
		Sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(Sortable.size());
		
		if(Sortable.size()>0) {
			System.out.println("Sortable Present");
		}else {
			System.out.println("Sortable not Present");
		}
		
		//To verify if draggable is present
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("Draggable Present");
		}else {
			System.out.println("Draggable not Present");
		}
		
		System.out.println("------------------------Switching back to Main Page------------------");
		
		driver.switchTo().defaultContent(); //Switching back to main page.
		
		Sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(Sortable.size());
		
		if(Sortable.size()>0) {
			System.out.println("Sortable Present");
		}else {
			System.out.println("Sortable not Present");
		}
		
		//To verify if draggable is present
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("Draggable Present");
		}else {
			System.out.println("Draggable not Present");
		}
	}
	

}
