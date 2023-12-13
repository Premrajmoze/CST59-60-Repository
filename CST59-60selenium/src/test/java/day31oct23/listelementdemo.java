package day31oct23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listelementdemo {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.letskodeit.com/practice");
	driver.get("https://demo.openmrs.org/openmrs/login.htm");
	driver.manage().window().maximize();
	//List<WebElement> low = driver.findElements(By.tagName("legend"));
	List<WebElement> low = driver.findElements(By.tagName("li"));

	int cnt=1;
	for (WebElement wb:low)
	{
		System.out.println(cnt++ + wb.getText());
		wb.click();
	}
}
}
