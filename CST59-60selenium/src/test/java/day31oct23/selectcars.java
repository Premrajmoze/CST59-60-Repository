package day31oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectcars {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	WebElement wel = driver.findElement(By.id("carselect"));
	Select select = new Select(wel);
	//select.selectByIndex(0);
	select.selectByIndex(1);
	//select.selectByIndex(2);
	select.selectByValue("bmw");
	select.selectByVisibleText("Benz");
	
	
	driver.quit();
}
}
