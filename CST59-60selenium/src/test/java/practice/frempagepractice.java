package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frempagepractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		List<WebElement> ele =driver.findElements(By.xpath("//h1"));
		System.out.println(ele.size());
		System.out.println(ele.get(0).getText());
		//driver.switchTo().frame(0);//index wise
		//driver.switchTo().frame("courses-iframe");//id wise
	    driver.switchTo().frame("iframe-name"); //name wise
		//WebElement fr = driver.findElement(By.name("iframe-name"));
		//driver.switchTo().frame(fr);
		ele=driver.findElements(By.xpath("//h1"));
		System.out.println(ele.get(0).getText());
		System.out.println(ele.size());
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("premraj");
		driver.findElement(By.id("autosuggest")).sendKeys("premraj");
		driver.findElement(By.id("enabled-example-input")).sendKeys("premraj");
		driver.findElement(By.id("displayed-text")).sendKeys("premraj");
		//driver.findElement(By.id("search")).sendKeys("python");
		//driver.getTitle();
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div/button/i")).click();
		//driver.getTitle();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
