package day3oct23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogindemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000l);
	driver.findElement(By.name("firstname")).sendKeys("prem");
	driver.findElement(By.name("lastname")).sendKeys("moze");
	driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
	driver.findElement(By.name("reg_passwd__")).sendKeys("1234567890");
	driver.findElement(By.xpath("//select[@id='day']")).sendKeys("30");
	driver.findElement(By.xpath("//select[@id='month']")).sendKeys("mar");
	driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2000");
	driver.findElement(By.xpath("(//input[@name='sex'])[3]")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("(//select)[4]/option[2]")).click();
	driver.findElement(By.name("custom_gender")).sendKeys("male"); 
	driver.findElement(By.name("websubmit")).click(); 
	
	
}


}
