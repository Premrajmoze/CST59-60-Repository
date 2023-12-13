package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sendandotherpractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autosuggest")).sendKeys("premraj");
		Thread.sleep(1000l);
		driver.findElement(By.id("bmwradio")).click();
		Thread.sleep(1000l);
		driver.findElement(By.id("benzradio")).click();
		Thread.sleep(1000l);
		driver.findElement(By.id("hondaradio")).click();
		Thread.sleep(1000l);
		driver.findElement(By.id("bmwcheck")).click();
		Thread.sleep(1000l);
		driver.findElement(By.id("hondacheck")).click();
		Thread.sleep(1000l);
		driver.findElement(By.id("benzcheck")).click();
		driver.findElement(By.id("openwindow")).click();
		driver.navigate().back();
		driver.findElement(By.id("opentab")).click();
		driver.navigate().back();
		  WebElement ele = driver.findElement(By.id("carselect")); 
		  Select select = new
		  Select(ele); select.selectByIndex(0);
		  select.deselectByIndex(0);
		  select.selectByIndex(1); 
		  select.deselectByIndex(1);
		  select.selectByIndex(2);
		  
		
		
		
		driver.quit();
	}
	

}
