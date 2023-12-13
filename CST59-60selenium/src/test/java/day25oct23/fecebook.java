package day25oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fecebook {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement useremail = driver.findElement(By.id("email"));
	 useremail.sendKeys("abcd@gmail.com");
	 Thread.sleep(3000l);
	 driver.quit();
}
}
