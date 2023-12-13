package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.openmrs.org/openmrs/login.htm");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Syber cyber");
	//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Cyber success1");
	driver.findElement(By.xpath("//input[@id='username'][@name='username'][@type='text']"));
	
	driver.quit();
	
	
}
}
