package day23oct23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day23 {
	
	
	static int driver = 0; 
	
	public static void main(String[] args) {
		
		String filepath = System.getProperty("user.dir")
				+ "\\src\\test\\java\\selenium\\abcd";
					System.out.println(filepath);
		Properties prop;
		try { 
		FileInputStream fin = new FileInputStream(filepath);
		prop = new Properties();
		prop.load(fin);
		System.out.println(fin);
		}
		catch (FileNotFoundException e)
		{
			throw new RuntimeException("filepath not found : " + filepath);	
		}catch (IOException e)
		{
			throw new RuntimeException("filepath not found : " + filepath);	
		}
		
		String browser =prop.getProperty("browser").trim();
		String url     = prop.getProperty(url).trim();
		
					System.out.println("browser : " + browser);
				
    	if (prop.getProperty("maxWindow").equals("true"))
						driver.manage().window().maximize();
    	
					getBrowserAndOpenUrl(browser, url);
			
	private static void getBrowserAndOpenUrl(String browser, String url) {
		switch (browser.toLowerCase())
		{
		case "chrome":
			driver=new ChromeDriver();
				break;
		case "firfox":
			driver=new FirefoxDriver();
				break;
		case "edge":
			driver=new EdgeDriver();
				break;
		default :	
		throw new RuntimeException("Invalid browser : " + browser);
		}
		driver.get(url);
		
	}


	
	
	}

	

	


		