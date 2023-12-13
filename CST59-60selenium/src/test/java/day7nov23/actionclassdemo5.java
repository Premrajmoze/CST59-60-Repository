package day7nov23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassdemo5 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.xpath("(//a)[63]")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300);","");
	
	Actions action = new Actions(driver);
	driver.switchTo().frame(0);
	WebElement risable = driver.findElement(By.xpath("//div[@style='z-index: 90;'][3]"));
	Thread.sleep(3000l);
	//action.clickAndHold(risable).moveByOffset(100, 100).release().build().perform();
	action.clickAndHold(risable).moveByOffset(200, 0).release().build().perform();
	//action.clickAndHold(risable).moveByOffset(0, 200).release().build().perform();
	
	
	
	
	
	
}
}
