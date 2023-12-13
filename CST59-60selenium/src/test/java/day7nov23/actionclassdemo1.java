package day7nov23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassdemo1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500);","");
	WebElement mouse = driver.findElement(By.id("mousehover"));
	Actions action = new Actions(driver);
	action.moveToElement(mouse).build().perform();
	driver.findElement(By.xpath("//a[@href='#top']")).click();
	Thread.sleep(3000l);
	action.moveToElement(mouse).build().perform();
	driver.findElement(By.xpath("//div)[31]//a[2]"));
	
	
	
	
	
	
;	
}
}
