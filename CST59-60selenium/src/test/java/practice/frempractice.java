package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frempractice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	List<WebElement> low = driver.findElements(By.xpath("//h1"));
	System.out.println(low.size());
	System.out.println(low.get(0).getText());
	driver.switchTo().frame(0);
	low = driver.findElements(By.xpath("//h1"));
	System.out.println(low.size());
	System.out.println(low.get(0).getText());
	driver.findElement(By.xpath("//select[@name='categories']/option[4]")).click();
	Thread.sleep(4000l);
	driver.findElement(By.xpath("//select[@name='categories']/option[1]")).click();
	Thread.sleep(1000l);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Test Automation");
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//i")).click();
	driver.findElement(By.className("img-responsive")).click();
	driver.findElement(By.xpath("//span[@class='fas fa-arrow-circle-right btn-icon-after']")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//*[@id=\"checkout-order-summary\"]/div[1]/table/tbody/tr[2]/td[1]/a")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//input[@id='inputSuccess2']")).sendKeys("ab2d3z9");
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//a[@class='coupon apply-coupon']")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("xyz@123gmail.com");
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//div[@id='card-number']")).sendKeys("abcd123");
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//input[@name='exp-date']")).sendKeys("01/30");
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("abcd123");
	Thread.sleep(2000l);
	driver.findElement(By.xpath("(//select[@name='country-list'])/option[5]")).click();
	Thread.sleep(2000l);
	driver.findElement(By.xpath("(//i[@class='fa fa-arrow-right'])[1]")).click();
	
	
}
}
