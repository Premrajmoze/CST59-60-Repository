package day26oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findRadiobtndemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	String url ="https://www.letskodeit.com/practice";
	driver.manage().window().maximize();
	driver.navigate().to(url);
	driver.findElement(By.id("bmwradio")).click();
	Thread.sleep(4000l);
	driver.findElement(By.id("hondaradio")).click();
	Thread.sleep(4000l);
	driver.findElement(By.id("benzradio")).click();
	Thread.sleep(4000l);
	 
	
	  boolean isSelectedRadioBtnBenz =
	  driver.findElement(By.id("benzradio")).isSelected();
	  System.out.println(isSelectedRadioBtnBenz); // true
	  
	  boolean isSelectedRadioBtnBmw =
	  driver.findElement(By.id("bmwradio")).isSelected();
	  System.out.println(isSelectedRadioBtnBmw); // false
	  
	  boolean isSelectedRadioBtnHonda =
	  driver.findElement(By.id("hondaradio")).isSelected();
	  System.out.println(isSelectedRadioBtnHonda); // false driver.quit();
	 
	
	
	
	
	
	
}
}
