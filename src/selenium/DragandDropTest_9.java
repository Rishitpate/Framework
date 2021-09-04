package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropTest_9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		System.out.println(droppable.getText());
		
		
		//Drag and drop Action - doubleclick, other actions
		Actions builder = new Actions(driver);//Action class always end with .build().perform().
		builder.dragAndDrop(draggable, droppable).build().perform();
		System.out.println(droppable.getText());
		
		if(droppable.getText().equals("Dropped!")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
	}

}
