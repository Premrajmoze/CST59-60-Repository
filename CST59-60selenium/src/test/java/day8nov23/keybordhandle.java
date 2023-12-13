package day8nov23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keybordhandle {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200);", "");
        
        driver.findElement(By.id("userName")).sendKeys("Mr prem moze");
        Thread.sleep(2000l);
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("prem@123gmail.com");
        Thread.sleep(2000l);
        WebElement currentad = driver.findElement(By.id("currentAddress"));
        currentad.sendKeys("good luck cafe ,deccon,pune ");
        Thread.sleep(2000l);
        String k = Keys.chord(Keys.CONTROL,"a");
        currentad.sendKeys(k);
        Thread.sleep(2000l);
        k = Keys.chord(Keys.CONTROL,"c");
        currentad.sendKeys(k);
        
        Actions action = new Actions(driver);
        
        action.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(2000l);
        WebElement permanantad = driver.findElement(By.id("permanentAddress"));
        permanantad.clear();
        k = Keys.chord(Keys.CONTROL,"v");
        permanantad.sendKeys(k);
        Thread.sleep(2000l);
        driver.quit();

        
        
        

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
