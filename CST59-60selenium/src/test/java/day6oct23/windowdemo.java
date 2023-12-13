package day6oct23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowdemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		String str = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://amazon.com");
		String str1 = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://filipkard.com");
		String str2 = driver.getWindowHandle();

		driver.close();
		
		driver.switchTo().window(str);
		driver.close();
		
		driver.switchTo().window(str1);
		driver.close();
		
		
		
	}

}
