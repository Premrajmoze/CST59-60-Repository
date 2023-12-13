package day2oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enterdemo {

	private static final CharSequence Keys = null;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String str = "https://www.google.com";
		driver.manage().window().maximize();
		driver.navigate().to(str);
		driver.findElement(By.name("q")).sendKeys("cyber success");
		
	}

}
