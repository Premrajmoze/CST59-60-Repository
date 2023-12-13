package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxDemo 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	boolean we;
	we= driver.findElement(By.id("bmwcheck")).isSelected();
	System.out.println("befor bmwcheck: "+we);
	driver.findElement(By.id("bmwcheck")).click();
	Thread.sleep(1000l);
	we = driver.findElement(By.id("bmwcheck")).isSelected();
	System.out.println("after bmwcheck: "+we);
	
	we =driver.findElement(By.id("benzcheck")).isSelected();
	System.out.println("befor benzcheck"+we);
	driver.findElement(By.id("benzcheck")).click();
	Thread.sleep(1000l);
	we = driver.findElement(By.id("benzcheck")).isSelected();
	System.out.println("after bmwcheck: "+we);
	
	we =driver.findElement(By.id("hondacheck")).isSelected();
	System.out.println("befor hondacheck"+we);
	driver.findElement(By.id("hondacheck")).click();
	Thread.sleep(1000l);
	we = driver.findElement(By.id("hondacheck")).isSelected();
	System.out.println("after hondacheck: "+we);
	
	driver.quit();
	
	
	
	
	
	
	
	
	
}
}
