package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxdemo1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.letscodeit.com/practice");
	driver.manage().window().maximize();
	List<WebElement> low = driver.findElements(By.xpath("(//input[@name='cars'][@type='checkbox'])[last()]"));
	for (WebElement we:low)
	{
		boolean res = we.isSelected();
		System.out.println("before check:" + res);
		Thread.sleep(2000l);
		we.click();
		res = we.isSelected();
		System.out.println("after check:" + res);
	}
	driver.quit();
	
}
} 
