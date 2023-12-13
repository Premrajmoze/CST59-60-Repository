package day25oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class debelement {

	private static void type(WebElement element, boolean erase,
			String... var) 
	{
		if (erase)
			element.clear();
		for (String str : var);
		element.sendKeys(var);
		
	}
		
		
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	WebElement element =  driver.findElement(By.id("autosuggest"));
	element.clear();
	element.sendKeys("cuyber success");
	element.sendKeys("deccon,fc road, pune");
	element.sendKeys("i,am,from,chatrpati sambhajinagar");
	type (element,true,"cyber success");
	type(element,false,"deccon,fc road, pune");
	type(element,false,"i,am,from,chatrpati sambhajinagar");
}
	}
