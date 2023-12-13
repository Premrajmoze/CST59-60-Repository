package day3oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headleesdemo {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions(); 
	option.addArguments("--headless");
	WebDriver driver = new ChromeDriver(option);
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.xpath("//h1"));
	System.out.println(ele.getText());
	driver.quit();
	
}
}
