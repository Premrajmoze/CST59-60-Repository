package day7nov23;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassdemo6 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://deluxe-menu.com/popup-mode-sample.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement image = driver.findElement(By.xpath("//p[2]/img"));
	
	Actions action = new Actions(driver);
	action.moveToElement(image).contextClick().build().perform();
	driver.findElement(By.id("dm2m1i1tdT")).click();//product info
	driver.findElement(By.id("dm2m2i1tdT")).click();//installetion
	driver.findElement(By.id("dm2m3i1tdT")).click();//how to steps
	
	Set<String> windowids= driver.getWindowHandles();
	System.out.println("no of wind"+windowids.size());
	Iterator<String> itr = windowids.iterator();
	String pwin = itr.next();
	String cwin = itr.next();
	System.out.println("pwin"+pwin);
	System.out.println("cwin"+cwin);
	driver.switchTo().window(cwin);
	String acturl = driver.getCurrentUrl();
	String expeurl = "http://deluxe-menu.com/installation-info.html";
	if (acturl.equals(expeurl))
		System.out.println("Test case#1 passed !");
	else
		System.out.println("Test case#1 failed !");
	
	String acthrf = driver.findElement(By.xpath("//strong")).getText();
	String exphrf = "Menu Script Installation";
	if (acthrf.equals(exphrf))
		System.out.println("Test case#2 passed !");
	
	else
		System.out.println("Test case#2 failed !");
	driver.quit();
	
	
	
}
}
