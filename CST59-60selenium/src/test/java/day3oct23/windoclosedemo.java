package day3oct23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windoclosedemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//driver.get("https://jquery.com/");
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	List<WebElement> web = driver.findElements(By.xpath("//div[@class='dev-links']//ul//li//a"));
	System.out.println(web.size());
	
	  for (WebElement ele : web) 
	  { 
		  web =driver.findElements(By.xpath("//div[@class='dev-links']//ul//li//a"));
		  String actual =ele.getText();
		  System.out.println(actual);
		  ele.click();
		 
	  if
	  (actual.equals("Submit a New Bug Report")) 
	  { Thread.sleep(2000l);
	  driver.findElement(By.name("login")).sendKeys("prem");
	  driver.findElement(By.name("password")).sendKeys("1234567"); 
	  Thread.sleep(2000l);
	  }
	  System.out.println(driver.getTitle());
	  driver.navigate().back();
	  } 
	 
	driver.close();
	
}
}
