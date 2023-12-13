package day31oct23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findlistno {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("");
	driver.manage().window().maximize();
	WebElement box = driver.findElement(By.xpath("//ol[1]"));
	List<WebElement> low = box.findElements(By.tagName("li"));
	System.out.println(low);
	
	  for (WebElement wbe:low) 
	  { wbe.click();
	  System.out.println("Title : " +driver.getTitle());
	  driver.navigate().back(); 
	  }
	 
		driver.quit();
	
}
}
