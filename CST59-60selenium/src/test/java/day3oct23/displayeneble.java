package day3oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class displayeneble
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300);", "");
	Thread.sleep(3000l);
	WebElement hidebuttn = driver.findElement(By.id("hide-textbox"));
    /*WebElement showbuttn=driver.findElement(By.id("show-textbox"));
	WebElement dispbuttn=driver.findElement(By.id("displayed-text"));
	boolean res = dispbuttn.isDisplayed();
	System.out.println(res);
	hidebuttn.click();
	Thread.sleep(3000l);
	res = dispbuttn.isDisplayed();
	System.out.println(res);
	showbuttn.click();
	Thread.sleep(3000l);
	res = dispbuttn.isDisplayed();
	System.out.println(res);
	Thread.sleep(3000l);
	dispbuttn.sendKeys("premraj");
	*/
	
	
	
	
	
	
}
}
