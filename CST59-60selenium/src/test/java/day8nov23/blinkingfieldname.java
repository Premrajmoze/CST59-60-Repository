package day8nov23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class blinkingfieldname {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	WebElement finame = driver.findElement(By.name("firstname"));
	js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 10px solid yellow;');", finame);
	finame.sendKeys("prem");
	Thread.sleep(3000);
	js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 1px solid grey;');", finame);
	
	WebElement laname = driver.findElement(By.name("lastname"));
	js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 10px solid yellow;');", laname);
	laname.sendKeys("moze");
	Thread.sleep(3000);
	js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 1px solid grey;');", laname);
	
	WebElement email = driver.findElement(By.name("reg_email__"));
	js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 10px solid yellow;');", email);
	email.sendKeys("abcd@gmail.com");
	Thread.sleep(3000);
	js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 1px solid grey;');", email);

	String val= driver.findElement(By.name("firstname")).getAttribute("value");
	System.out.println("value: " + val);

	String txt = driver.findElement(By.name("firstname")).getText();
	System.out.println("txt: " + txt); //will not have any value

	
	System.out.println(finame.getCssValue("background-color"));
	System.out.println(laname.getCssValue("background-color"));
	System.out.println(email.getCssValue("background-color"));
	
}
}
