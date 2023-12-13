package day3oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enabledesable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.findElement(By.id("disabled-button")).click();
		driver.findElement(By.id("enabled-button")).click();
		driver.findElement(By.id("enabled-example-input")).sendKeys("premraj");
		driver.quit();
	}

}
