package day23oct23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class abc {
static WebDriver driver;  // instance variable/non static variable/lobal variable
	
	private static WebDriver getBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else 		
			throw new RuntimeException("invalid Browser : " + browser);
		return driver;
	}
	
	public static void main(String[] args) 
	{	
		String filePath =System.getProperty("user.dir")
				+ "\\src\\test\\java\\selenium\\abcd";

		System.out.println("filePath : " + filePath);
		Properties prop;
		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("filepath not found : " + filePath);
		} catch (IOException e) {
			throw new RuntimeException("Error in reading file : " + filePath);
		}
		
 		String browser = prop.getProperty("browser").trim();
 		String url     = prop.getProperty("url").trim();
		System.out.println("browser : " + browser); 
		
		driver = getBrowser(browser);
		
		driver.get("https://www.google.com");
		String wTitle = driver.getTitle();
		System.out.println("Window Title : " + wTitle);
		
		driver.close();
	}

}
