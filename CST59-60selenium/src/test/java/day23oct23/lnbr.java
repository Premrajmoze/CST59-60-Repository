package day23oct23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lnbr {
static WebDriver driver;
	
	private static WebDriver launchBrowser(String browser) 
	{
		if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else 
			throw new RuntimeException("Invalid Browser : " + browser);
		return driver;
	}
public static void main(String[] args) throws Exception {
	String browser;
	String fileName = System.getProperty("user.dir")
			+ "\\src\\test\\java\\selenium\\abcd";
	FileInputStream fis = new FileInputStream(fileName);
	Properties prop = new Properties();
	prop.load(fis);
	browser = prop.getProperty("browser");
	String url = prop.getProperty("url");
	
	driver = launchBrowser(browser);
	
	driver.get(url);
	driver.manage().window().maximize();
	System.out.println("title : " + driver.getTitle());
	System.out.println("URL   : " + driver.getCurrentUrl());
	
	
}
}
