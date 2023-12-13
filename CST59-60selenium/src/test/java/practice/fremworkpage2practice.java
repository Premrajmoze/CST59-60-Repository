package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fremworkpage2practice {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		List<WebElement> low = driver.findElements(By.xpath("//h1"));
		System.out.println(low.size());  //1 other h1 element is present inside the iframe and so not visible currently
		System.out.println("outside frame text: " + low.get(0).getText());
		
		
		// By index
		//driver.switchTo().frame(0);
		
		// by id or name
		// driver.switchTo().frame("courses-iframe");
	    // driver.switchTo().frame("iframe-name");
		
		// by using webElement
		WebElement fr = driver.findElement(By.name("iframe-name"));
		driver.switchTo().frame(fr);
		
		low = driver.findElements(By.xpath("//h1"));
		System.out.println(low.size());  
		System.out.println("inside frame text: " + low.get(0).getText());
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Sachin");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
