package day2oct23;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertdemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	String x = "prem";
	WebElement we = driver.findElement(By.name("enter-name"));
	we.sendKeys(x);
	driver.findElement(By.xpath("//input[@value='Alert']")).click();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(3000l);
	String actTxt = alert.getText();
	String Exptxt = "Hello " + x + ", share this practice page and share your knowledge";
	alert.accept();
	if(we.getText().isEmpty() &&  actTxt.equals(Exptxt))
	{
		System.out.println("ok");
	}
	else
		System.out.println("not ok");
	driver.quit();
	
}
}
