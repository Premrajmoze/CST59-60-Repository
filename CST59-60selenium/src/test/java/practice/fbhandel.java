package practice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fbhandel {
	static WebDriver driver;
	static void enterValue(By by, String data)
	{
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.presenceOfElementLocated(by));
		
		driver.findElement(by).sendKeys(data);
	}
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createNewAcBtn = driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0_')]"));
		createNewAcBtn.click();
		
		//fluent wait
		 FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(5));  // max amount of time before raising noSuchElementFound exception
		wait.pollingEvery(Duration.ofMillis(200));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));		
		enterValue(By.name("firstname"), "AAAAAA");
		enterValue(By.name("lastname"), "BBBBBB");
		enterValue(By.name("reg_email__"), "aaaaa@gmail.com");
		enterValue(By.name("reg_passwd__"), "Cyber@12344566");
		
	
	}
	
}
