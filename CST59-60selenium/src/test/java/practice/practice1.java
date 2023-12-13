package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		String str = "https://www.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.get(str);
		WebElement webelement = driver.findElement(By.id("autosuggest"));
		webelement.sendKeys("cyber success");
		webelement.sendKeys("openwindow");
		
		
		
		
		driver.close();
	}
}
