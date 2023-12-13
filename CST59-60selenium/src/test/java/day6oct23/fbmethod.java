package day6oct23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fbmethod {
	
	
	static WebDriver driver;
	static void entervalue(By by,String data)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		
		driver.findElement(by).sendKeys(data);
	}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement creatnew = driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0_')]"));
		creatnew.click();
		entervalue(By.name("firstname"),("prem"));
		entervalue(By.name("lastname"),("moze"));
		entervalue(By.name("reg_email__"),("1234567890"));
		entervalue(By.name("reg_passwd__"),("1234567890"));
		entervalue(By.xpath("//select[@id='day']"),("30"));
		entervalue(By.xpath("//select[@id='month']"),("mar"));
		entervalue(By.xpath("//select[@id='year']"),("2000"));
		WebElement ok = driver.findElement(By.xpath(("(//input[@name='sex'])[3]")));
		ok.click();
		WebElement ok1 =driver.findElement(By.xpath("(//select)[4]/option[2]"));
		ok1.click();
		entervalue(By.name("custom_gender"),("male"));
		WebElement ok2 = driver.findElement(By.name("websubmit")); 
		ok2.click();
	}
	}


	


