package day7nov23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassdemo2 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("(//div[@id='content']/following-sibling::div//ul//li[2]/a)[1]")).click();
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		//action.dragAndDrop(drag, drop).build().perform();
		//action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		action.clickAndHold(drag).moveToElement(drop,50,50).release().build().perform();
		
		
		
		
		
		
	}

	
}
