package day21oct23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoitrequard {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver  = new ChromeDriver();
	driver.navigate().to("https://the-internet.herokuapp.com/upload");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
	Thread.sleep(3000l);
	driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("D:/demoauto.exe");
	Thread.sleep(4000l);
	driver.findElement(By.xpath("//input[@id='file-submit']")).click();
	
	String actMsg = driver.findElement(By.xpath("//h3")).getText();
	String expMsg = "File Uploaded!";
	if (actMsg.equals(expMsg))
			System.out.println("File uploaded successfully !");
	else
		System.out.println("File did not upload !");
	
 	Thread.sleep(4000l);
 	driver.quit();
}
}
