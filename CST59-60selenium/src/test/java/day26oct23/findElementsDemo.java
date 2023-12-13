package day26oct23;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsDemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	String url ="https://www.letskodeit.com/practice";
	driver.manage().window().maximize();
	driver.navigate().to(url);
	List<WebElement> lowRadiobtn =driver.findElements(By.xpath("input[@type='radio']"));
	for (WebElement ele : lowRadiobtn) 
	{
		System.out.println(ele.isSelected());
		System.out.println(ele.isDisplayed());
		ele.click();
		System.out.println("radio btn"+ele.isSelected());
		Thread.sleep(4000l);
	}
	driver.quit();
	
	
	
	
	
}
}
