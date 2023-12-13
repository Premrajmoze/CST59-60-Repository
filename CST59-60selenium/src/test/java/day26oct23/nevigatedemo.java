package day26oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nevigatedemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	String url ="https://www.hdfc.com";
	driver.manage().window().maximize();
	driver.navigate().to(url);
	//driver.get(url);
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.id("explore-more-btn")).click();
	driver.getCurrentUrl();
	Thread.sleep(4000l);
	driver.navigate().back();
	System.out.println("org windoes url"+driver.getCurrentUrl());
	Thread.sleep(3000l);
	driver.navigate().forward();
	System.out.println("new windous url"+driver.getCurrentUrl());
	Thread.sleep(4000l);
	driver.quit();
}
	
}
