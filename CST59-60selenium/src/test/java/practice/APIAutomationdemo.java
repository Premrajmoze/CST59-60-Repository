package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class APIAutomationdemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		List<WebElement> low = driver.findElements(By.xpath("//h1"));
		System.out.println(low.size());
		System.out.println(low.get(0).getText());
		driver.switchTo().frame(0);
		low = driver.findElements(By.xpath("//h1"));
		System.out.println(low.size());
		System.out.println(low.get(0).getText());
		driver.findElement(By.xpath("//select[@name='categories']/option[7]")).click();
		Thread.sleep(1000l);
		driver.findElement(By.xpath("//i")).click();
		driver.findElement(By.className("img-responsive")).click();
		driver.findElement(By.xpath("//span[@class='fas fa-arrow-circle-right btn-icon-after']")).click();
		/*driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("\"abc123@gmail.com\"");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//*[@id='root']/form/span[2]/div/div/div[2]/span/input")).sendKeys("feg4jd65");
		driver.findElement(By.xpath("//input[@name='exp-date']")).sendKeys("01/50");
		driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("x1y2z3");
		driver.findElement(By.xpath("//select[@name='country-list']/option[5]")).click();
		driver.findElement(By.xpath("(//i[@class='fa fa-arrow-right'])[1]")).click();
		*/
}
}
