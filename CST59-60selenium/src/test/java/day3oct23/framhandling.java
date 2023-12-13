package day3oct23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framhandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		List<WebElement> web = driver.findElements(By.xpath("//h1"));
		System.out.println(web.size());
		System.out.println(web.get(0).getText());
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("courses-iframe");
		//driver.switchTo().frame("iframe-name");
		WebElement fr = driver.findElement(By.name("iframe-name"));
		driver.switchTo().frame(fr);
		driver.findElement(By.xpath("//h1"));
		System.out.println(web.size());
		System.out.println(web.get(0).getText());
		driver.switchTo().defaultContent();
		Thread.sleep(4000l);
		driver.findElement(By.id("name")).sendKeys("premraj");
		driver.quit();
		
		
		
		
		
		
	}

}
