package day2oct23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		List<WebElement> headerlist = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
		for (WebElement headr : headerlist)
			System.out.print(String.format("%-32s",headr.getText()));
			System.out.println();
			List<WebElement> low = driver.findElements(By.xpath("//table[@id='product']//tr/td"));
			int cnt=1;
			for (WebElement ele : low) 
			{
				System.out.print(String.format("%-32s",ele.getText()));
				if((cnt%3)==0)
				System.out.println();
				cnt++;
			}
			driver.quit();
		}
	}

