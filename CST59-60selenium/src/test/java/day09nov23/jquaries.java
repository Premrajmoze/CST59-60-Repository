package day09nov23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquaries {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	driver.manage().window().maximize();
	driver.findElement(By.id("justAnInputBox")).click();
	
	List<WebElement> lowe = driver.findElements(By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//span[@class='comboTreeItemTitle']"));
	System.out.println(lowe.size());
	for (WebElement ele : lowe) {
		System.out.println(ele.getText());
		if(ele.getText().equals("choice 2 2"))
			ele.click();
		
		//driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
