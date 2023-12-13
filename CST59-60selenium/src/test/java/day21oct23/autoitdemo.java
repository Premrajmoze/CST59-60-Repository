package day21oct23;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoitdemo {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/basic_auth");
	driver.manage().window().maximize();
	Thread.sleep(4000l);
	Runtime.getRuntime().exec("D:\\demoauto.exe");
	
	Thread.sleep(4000l);
	String extmsg = "Congratulations! You must have the proper credentials.";
	 String actmsg = driver.findElement(By.xpath("//*[@id='content']/div/p")).getText();
	 if( extmsg.equals(actmsg))
	 {
		 System.out.println("test case pass");
	 }
	 else
	 {
		 System.out.println("test case fail");
	 }
	 Thread.sleep(3000l);
		driver.quit();
}
}
