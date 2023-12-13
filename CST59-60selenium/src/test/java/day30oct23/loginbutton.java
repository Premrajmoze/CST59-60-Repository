package day30oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginbutton {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.openmrs.org/openmrs/login.htm");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Cyber");
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("9561838093");
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//i[@id='togglePassword']")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//li[@id='Inpatient Ward']")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//li[@id='Outpatient Clinic']")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//li[@id='Isolation Ward']")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//li[@id='Pharmacy']")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//li[@id='Laboratory']")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//li[@id='Registration Desk']")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//input[@id='loginButton']")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//a[@id='cantLogin']")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000l);


	driver.quit();
}
}
