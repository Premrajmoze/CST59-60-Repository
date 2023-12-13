package day31oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classnamedemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	/*WebElement wbe = driver.findElement(By.className("dropbtn"));
	Thread.sleep(3000l);
	wbe.click();*/
	WebElement wbe = driver.findElement(By.className("btn-style class1"));
	Thread.sleep(4000l);
	wbe.click();
	
}
}
