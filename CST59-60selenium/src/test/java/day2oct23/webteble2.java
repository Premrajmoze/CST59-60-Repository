package day2oct23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webteble2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		List<WebElement> headerlist = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
		for (WebElement headr : headerlist)
			System.out.print(String.format("%-32s",headr.getText()));
			System.out.println();
			String part1 = "//table[@id='product']//tr[";
			String part2 = "]/td";
			int cnt = 2;
			while (cnt<=4)
			{
		         List<WebElement> webele =driver.findElements(By.xpath(part1+cnt+part2));
			for (WebElement ele : webele) 
				System.out.print(String.format("%-32s",ele.getText()));
				System.out.println();
				cnt++;
				
			}
			driver.quit();
	}
}
