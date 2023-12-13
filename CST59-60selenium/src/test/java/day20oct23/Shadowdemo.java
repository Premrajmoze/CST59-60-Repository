package day20oct23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Shadowdemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.get("https://shop.polymer-project.org");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	SearchContext btnshop = driver.findElement(By.tagName("shop-app")).getShadowRoot();
	btnshop.findElement(By.cssSelector("a[href='/list/mens_outerwear']")).click();
	Thread.sleep(4000l);
	
	SearchContext btnshop1 = driver.findElement(By.tagName("shop-app")).getShadowRoot();

	btnshop1.findElement(By.cssSelector("a[href='/list/ladies_outerwear']")).click();
	
	
	
	
	
}
}
