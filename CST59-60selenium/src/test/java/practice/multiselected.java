package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselected {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.id("carselect"));
	Select select = new Select(ele);
	select.selectByIndex(0);

}
}
