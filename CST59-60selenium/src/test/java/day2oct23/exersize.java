package day2oct23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exersize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jquery.com/");
		driver.manage().window().maximize();
		List<WebElement> wel= driver.findElements(By.xpath("(//aside)[2]//li/a"));
		int cnt=1;
		for (WebElement ele : wel)
		{
			driver.findElements(By.xpath("(//aside)[2]//li/a"));
			System.out.println(cnt++ + ele.getTagName());
			String hRef = ele.getAttribute("href");
			ele.click();
			String actual = driver.getCurrentUrl();
			System.out.println(hRef + ": "+actual);
			if(actual.equals(hRef))
				System.out.println("Link is working properly");
			else
				System.out.println("Link is not working properly");
			driver.navigate().back();
		}
		driver.quit();
	}	
}
