package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practicepage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.findElements(By.tagName("legend[1]"));
			System.out.println(driver.getTitle());
			
			driver.findElement(By.id("bmwradio")).click();
			System.out.println("BMW");
			Thread.sleep(1000l);	
			
			driver.findElement(By.id("hondaradio")).click();
			System.out.println("HONDA");
			Thread.sleep(1000l);
			
			driver.findElement(By.id("benzradio")).click();
			System.out.println("BENZ");
			Thread.sleep(1000l);
			List<WebElement> low = driver.findElements(By.xpath("//input[@name='cars'][@type='checkbox']"));
			boolean res; 
			for(int i=0;i<low.size();i++)
			{
				res = low.get(i).isSelected();
				low.get(i).click();
				res = low.get(i).isSelected();
				Thread.sleep(1000l);
			}
			driver.findElement(By.id("openwindow")).click();
			Thread.sleep(1000l);
			driver.navigate().back();
			
			driver.findElement(By.id("opentab")).click();
			Thread.sleep(1000l);
			driver.navigate().back();
			
			WebElement ele1 = driver.findElement(By.id("carselect"));
			Select select = new Select(ele1);
			List<WebElement> low1 = select.getOptions();
			System.out.println(low.size());
			for (WebElement ele2 : low) 
				System.out.println(ele2.getText());
			 
			
		
	driver.quit();
	}

}
