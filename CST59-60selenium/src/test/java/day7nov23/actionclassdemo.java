package day7nov23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassdemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement txtautosuggetion = driver.findElement(By.id("autosuggest"));
	Actions action = new Actions(driver);
	//action.moveToElement(txtautosuggetion).click().sendKeys("prem").build().perform();
	action.sendKeys(txtautosuggetion,"premraj").build().perform();
	Thread.sleep(4000);
	WebElement btnopenwindow = driver.findElement(By.id("openwindow"));
	action.click(btnopenwindow).build().perform();
	
	
	
	driver.quit();
	
	
}
}
