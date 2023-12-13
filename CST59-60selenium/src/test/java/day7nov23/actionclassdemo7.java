package day7nov23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassdemo7 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement slider = driver.findElement(By.xpath("(//a)[76]"));
	slider.click();
	driver.switchTo().frame(0);
	WebElement sliderimage = driver.findElement(By.xpath("//span[@tabindex='0']"));
	Actions action = new Actions(driver);
	Thread.sleep(4000l);
	//action.moveToElement(sliderimage).clickAndHold().moveByOffset(200, 0).release().build().perform();
	action.dragAndDropBy(sliderimage,200,0).build().perform();
	
	
	
	
	
	
	
	
	
	
}
}
