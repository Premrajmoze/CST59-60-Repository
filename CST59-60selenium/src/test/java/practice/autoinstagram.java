package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoinstagram {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9561838093");
	driver.findElement(By.xpath("//button[@class='_1wGnMD rX1XT4 _2nD2xJ']")).click();
	
}
}
