package day23oct23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {
	public static void main(String[] args) throws Exception {
	WebDriver drive = new ChromeDriver();
	Thread.sleep(5000l);
	drive.close();
	 drive = new EdgeDriver();
	 Thread.sleep(5000l);
	 drive.close();
	 drive = new FirefoxDriver();
	 Thread.sleep(5000l);
	 drive.close();
	drive.get("https:\\www.google.com");
	drive.close();
	}
}
