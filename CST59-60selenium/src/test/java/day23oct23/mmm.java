package day23oct23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mmm {
static WebDriver driver = null;  // global webdriver variable
	
	public static void main(String[] args) 
	{
		String filePath =System.getProperty("user.dir")
				+ "\\src\\test\\java\\selenium\\abcd";

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
		
		getBrowserAndOpenUrl(browser, url);
		
/*		if (prop.getProperty("maxWindow").equals("true"))
			driver.manage().window().maximize();
*/
		if (Boolean.parseBoolean(prop.getProperty("maxWindow")))
			driver.manage().window().maximize();
	}
		
		/* manage() - a method from  WebDriver
		 * manage() -> returns Options interface instance
		 * window() -> returns Window() methods from Options interface
		 * maximize -> method which returns nothing means void 
		 *             maximize is a method from Window
		 */
		String wTitle = driver.getTitle();
		//System.out.println("Window Title : " + wTitle);
		{
		try {
			Thread.sleep(4000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	
		}
	 static void getBrowserAndOpenUrl(String browser, String url) {
		
		switch(browser.toLowerCase())
		{
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			default:
				throw new RuntimeException("Invalid browser : " + browser);
		}
		
		driver.get(url);
}
	}

