package day25oct23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdr {
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	//System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	System.out.println(" get window Handels"+driver.getWindowHandle());
	
	Thread.sleep(3000l);
	driver.close();
	
	
	
	
	
}
}
